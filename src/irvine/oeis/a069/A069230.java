package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A069192.
 * @author Sean A. Irvine
 */
public class A069230 extends A000005 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final long t = super.next().longValueExact();
    long cnt = 0;
    for (long p = mPrime.nextPrime(mN); p < mN + t * t; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

