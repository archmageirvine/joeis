package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062584 a(n) is the smallest prime whose digits include the digits of n as a substring.
 * @author Sean A. Irvine
 */
public class A062584 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long p = mN - 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (String.valueOf(p).contains(s)) {
        return Z.valueOf(p);
      }
    }
  }
}
