package irvine.factor.project.homeprime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;

/**
 * For a given number find all numbers whose home prime sequence passes through
 * the given number.  If the given number is a prime, this is equivalent to
 * finding all numbers with that home prime.
 *
 * @author Sean A. Irvine
 */
public final class ReverseHomePrime {

  private ReverseHomePrime() { }

  /*
   * Find prime prefix of the given number.  Given a number <code>s</code> as a
   * base <code>base</code> string, find the smallest prefix of <code>s</code>
   * having length at least <code>minLength</code> and values exceeding <code>
   * min</code> for which the prefix is a prime.  If no such prefix exists, then
   * 0 is returned, otherwise the length of the prefix is returned.
   */
  private static int firstPrime(final String s, final int minLength, final Z min, final int base) {
    if (s.startsWith("0")) {
      return 0;
    }
    for (int k = minLength; k <= s.length(); ++k) {
      final Z t = new Z(s.substring(0, k), base);
      if (t.compareTo(min) >= 0 && t.isProbablePrime()) {
        return k;
      }
    }
    return 0;
  }

  /*
   * Given a number <code>s</code> written in base <code>base</code>, find all
   * partitions of <code>s</code> into primes such that p_i &lt;= p_{i+1} with
   * first prime at least <code>m</code> digits long.  Returns a list of the
   * factorizations.  Uses a recursive algorithm.
   */
  private static List<List<String>> primeify(final String s, int m, final Z min, final int base) {
    final List<List<String>> results = new ArrayList<>();
    while (m <= s.length()) {
      final int fp = firstPrime(s, m, min, base);
      if (fp == 0) {
        return results;
      }
      m = fp + 1;
      if (fp >= s.length()) {
        final List<String> r = new ArrayList<>();
        r.add(s);
        results.add(r);
      } else {
        final String t = s.substring(0, fp);
        for (final List<String> zl : primeify(s.substring(fp), fp, new Z(t, base), base)) {
          zl.add(0, t);
          results.add(zl);
        }
      }
    }
    return results;
  }

  /**
   * Find all the possible home prime decompositions of a number. That is,
   * given <code>n</code>, consider its decimal representation and cut
   * it up in every possible way such that each part is a prime and in
   * a given cut the primes forms a monotonically non-decreasing sequence.
   *
   * @param n number to get decompositions for
   * @param base base
   * @return all possible decompositions
   * @exception NullPointerException if <code>n</code> is null.
   */
  public static List<List<String>> primeify(final String n, final int base) {
    return primeify(n, 1, Z.ONE, base);
  }

  /**
   * Return a list containing every integer that has a given integer
   * in its home prime tree.  If the supplied number is a prime, then
   * this will constitute every number such that HP(x)=n.
   *
   * @param n target number
   * @param base base
   * @return all numbers in the subtree rooted at n
   */
  public static List<Z> homePrimeTree(final Z n, final int base) {
    final ArrayList<Z> results = new ArrayList<>();
    final ArrayList<Z> todo = new ArrayList<>();
    todo.add(n);
    while (!todo.isEmpty()) {
      final Z z = todo.remove(0);
      results.add(z);
      for (final List<String> g : primeify(z.toString(base), base)) {
        Z product = Z.ONE;
        for (final String v : g) {
          product = product.multiply(new Z(v, base));
        }
        if (!product.equals(z)) {
          todo.add(product);
        }
      }
    }
    Collections.sort(results);
    return results;
  }

  /**
   * Generate reverse home prime lookups.  See the description of
   * <code>homePrimeTree</code>.
   *
   * @param args number [base]
   */
  public static void main(final String[] args) {
    final int base = args.length == 2 ? Integer.parseInt(args[1]) : 10;
    final List<Z> nums = homePrimeTree(new Z(args[0], base), base);
    final Z[] v = nums.toArray(new Z[0]);
    for (final Z z : v) {
      System.out.println(z);
    }
  }
}
