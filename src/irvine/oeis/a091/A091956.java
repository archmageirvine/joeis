package irvine.oeis.a091;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A091956 Number of increasing subsequences that can be made from the sequence of successive primes.
 * @author Sean A. Irvine
 */
public class A091956 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private String mS = "";

  /**
   * Compute number of increasing sequences that can be generated from
   * <code>s</code> by splitting at any number of points.
   *
   * @param s number
   * @param prev previous term
   * @return count of increasing sequences
   */
  static long increasingSequences(final String s, final Z prev) {
    final int plen = prev.toString().length();
    if (plen > s.length()) {
      return 0;
    }
    if (new Z(s).compareTo(prev) <= 0) {
      return 0;
    }
    long c = 1;
    for (int k = plen; k < s.length(); ++k) {
      final Z n = new Z(s.substring(0, k));
      if (n.compareTo(prev) > 0) {
        c += increasingSequences(s.substring(k), n);
      }
    }
    return c;
  }

  /*
  static long increasingSequences(final String s, final Z prev, final String chain) {
    final int plen = prev.toString().length();
    if (plen > s.length()) {
      return 0;
    }
    if (new Z(s).compareTo(prev) <= 0) {
      return 0;
    }
    System.out.println(chain + "," + new Z(s));
    long c = 1;
    for (int k = plen; k < s.length(); ++k) {
      final Z n = new Z(s.substring(0, k));
      if (n.compareTo(prev) > 0) {
        c += increasingSequences(s.substring(k), n, chain + "," + n);
      }
    }
    return c;
  }
  */

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mS = mS + mP;
    return Z.valueOf(increasingSequences(mS, Z.ZERO));
  }
}

