package irvine.factor.util;

import java.util.HashSet;

import irvine.factor.factor.CachedFactorizer;
import irvine.factor.factor.FactorDbFactorizer;
import irvine.factor.factor.Factorizer;
import irvine.factor.factor.Jaguar;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Sircon;
import irvine.math.z.Z;

/**
 * Attempt to build the aliquot sequence for a number. Backed by
 * <code>factordb.com</code>.
 *
 * @author Sean A. Irvine
 */
public class AliquotSequence {

  private final Factorizer mFactorizer = new CachedFactorizer(new FactorDbFactorizer());

  static FactorSequence getFactorSequence(final Z n, final Factorizer factorizer) {
    FactorSequence fs = Jaguar.factor(n);
    // Try a bunch of times at FactorDb because it can take a while to factor
    // some smaller numbers. However, if the pieces remaining are too big then
    // give up straight away.
    int attempts = 0;
    outer: while (!fs.isComplete() && ++attempts < 5) {
      // Because of the encoding at factordb, it seems to be better to look up
      // the original number, rather than the part already factored.  Hence we
      // create a new one.
      fs = new FactorSequence(n);
      factorizer.factor(fs);
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
    System.out.println(FactorSequence.toString(fs));
    return fs;
  }

  void aliquot(Z n) {
    long step = 0;
    final HashSet<Z> seen = new HashSet<>(); // For cycle detection
    while (seen.add(n)) {
      if (n.isProbablePrime()) {
        System.out.println(n);
        System.out.println("prime");
        return;
      }
      final FactorSequence fs = getFactorSequence(n, mFactorizer);
      if (!fs.isComplete()) {
        final StringBuilder sb = new StringBuilder();
        for (final Z v : fs.toZArray()) {
          if (fs.getStatus(v) == FactorSequence.COMPOSITE || fs.getStatus(v) == FactorSequence.UNKNOWN) {
            if (sb.length() > 0) {
              sb.append(", ");
            }
            sb.append('C').append(v.toString().length());
          }
        }
        System.out.println("incomplete " + step + " " + sb.toString());
        return;
      }
      n = fs.sigma().subtract(n);
      ++step;
    }
    System.out.println("cycle");
  }

  /**
   * Main program.
   * @param args numbers to generate sequence for
   */
  public static void main(final String[] args) {
    final AliquotSequence as = new AliquotSequence();
    for (final String a : args) {
      final Z n = ((LiteralZ) Sircon.parse(a).eval()).value();
      System.out.println("Aliquot sequence for: " + a);
      as.aliquot(n);
    }
  }

}

