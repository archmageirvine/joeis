package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A060299 n consecutive nonprimes.
 * @author Sean A. Irvine
 */
public class A060299 extends A002808 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      while (true) {
        final Z t = super.next();
        if (mPrime.nextPrime(t).subtract(t).longValueExact() >= mN) {
          mM = mN - 1;
          return t;
        }
      }
    }
    return super.next();
  }
}
