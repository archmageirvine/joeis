package irvine.oeis.a173;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A173448.
 * @author Sean A. Irvine
 */
public class A173448 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private boolean test(long p, int n) {
    final StringBuilder sb = new StringBuilder();
    while (n-- > 0) {
      sb.append(p);
      p = mPrime.nextPrime(p);
    }
    final String s = sb.toString();
    if (StringUtils.isPalindrome(s)) {
      return false;
    }
    final Z z = new Z(s);
    // Strange ordering of prime tests for speed
    if (!z.isProbablePrime(2)) {
      return false;
    }
    final Z e = new Z(sb.reverse());
    return e.isProbablePrime(4) && z.isProbablePrime(28) && e.isProbablePrime(26);
  }

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (test(p, mN)) {
        return Z.valueOf(p);
      }
    }
  }
}

