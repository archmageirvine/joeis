package irvine.factor.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.factor.factor.CachedFactorizer;
import irvine.factor.factor.Cheetah;
import irvine.factor.factor.FactorDbFactorizer;
import irvine.factor.factor.Factorizer;
import irvine.math.z.Z;

/**
 * Attempt to build the infinitary aliquot sequence for a number. Backed by
 * <code>factordb.com</code>.
 *
 * @author Sean A. Irvine
 */
public class InfinitaryAliquotSequence {

  private final Cheetah mCheetah = new Cheetah(false);
  private final Factorizer mFactorizer = new CachedFactorizer(new FactorDbFactorizer());

  private static boolean isInfinitaryExponent(final int u, final int v) {
    return (u | v) == v;
  }

  private static List<List<Z>> makeInfinitaryPerPrime(final FactorSequence fs) {
    final ArrayList<List<Z>> infinitary = new ArrayList<>();
    for (final Z p : fs.toZArray()) {
      final List<Z> inf = new ArrayList<>();
      final int v = fs.getExponent(p);
      Z q = Z.ONE;
      for (int u = 0; u <= v; ++u, q = q.multiply(p)) {
        if (isInfinitaryExponent(u, v)) {
          inf.add(q);
        }
      }
      infinitary.add(inf);
    }
    return infinitary;
  }

  private static boolean bump(final int[] index, final List<List<Z>> inf) {
    int pos = index.length - 1;
    while (pos >= 0) {
      if (++index[pos] < inf.get(pos).size()) {
        return true;
      }
      for (int k = pos; k < index.length; ++k) {
        index[k] = 0;
      }
      --pos;
    }
    return false;
  }

  /**
   * Return the infinitary divisors of a factor sequence
   * @param fs factor sequence
   * @return infinitary divisors
   */
  public static List<Z> infinitaryDivisors(final FactorSequence fs) {
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException(fs.toString());
    }
    final List<Z> divisors = new ArrayList<>();
    final List<List<Z>> perPrimeInfinitary = makeInfinitaryPerPrime(fs);
    // Choose every combination of exactly one element from each list in perPrimeInfinitary
    final int[] index = new int[perPrimeInfinitary.size()];
    do {
      Z d = Z.ONE;
      for (int k = 0; k < index.length; ++k) {
        d = d.multiply(perPrimeInfinitary.get(k).get(index[k]));
      }
      divisors.add(d);
    } while (bump(index, perPrimeInfinitary));
    return divisors;
  }

  private static Z infinitarySigma(final FactorSequence fs) {
    Z sum = Z.ZERO;
    for (final Z d : infinitaryDivisors(fs)) {
      sum = sum.add(d);
    }
    return sum;
  }

  void infinitaryAliquot(Z n) {
    long step = 0;
    final HashSet<Z> seen = new HashSet<>(); // For cycle detection
    while (seen.add(n)) {
      if (n.isProbablePrime()) {
        System.out.println(n);
        System.out.println("prime");
        return;
      }
      FactorSequence fs = new FactorSequence(n);
      mCheetah.factor(fs);
      // Try a bunch of times at FactorDb because it can take a while to factor
      // some smaller numbers. However, if the pieces remaining are too big then
      // give up straight away.
      int attempts = 0;
      outer: while (!fs.isComplete() && ++attempts < 5) {
        // Because of the encoding at factordb, it seems to be better to look up
        // the original number, rather than the part already factored.  Hence we
        // create a new one.
        fs = new FactorSequence(n);
        mFactorizer.factor(fs);
        if (fs.isComplete()) {
          break;
        }
        for (final Z q : fs.toZArray()) {
          if ((fs.getStatus(q) == FactorSequence.COMPOSITE || fs.getStatus(q) == FactorSequence.UNKNOWN) && q.toString().length() > 80) {
            break outer;
          }
        }
        try {
          Thread.sleep(10000);
        } catch (final InterruptedException e) {
          // ok
        }
      }
      n = infinitarySigma(fs).subtract(n);
      if (Z.ONE.equals(n)) {
        System.out.println('1');
        break;
      }
      System.out.println(FactorSequence.toString(fs));
      if (!fs.isComplete()) {
        System.out.println("incomplete " + step);
        return;
      }
      ++step;
    }
    System.out.println("cycle");
  }

  /**
   * Main program.
   * @param args numbers to generate sequence for
   */
  public static void main(final String[] args) {
    final InfinitaryAliquotSequence as = new InfinitaryAliquotSequence();
    for (final String a : args) {
      final Z n = new Z(a);
      System.out.println("Infinitary aliquot sequence for: " + a);
      as.infinitaryAliquot(n);
    }
  }

}

