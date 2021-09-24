package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A051692 a(n) is twice the smallest k such that A051686(k) = prime(n).
 * @author Sean A. Irvine
 */
public class A051692 extends A051686 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mP = 1;
  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (mA.get(mP) == 0) {
      ++mN;
      final long t = super.next().longValueExact();
      if (mA.get(t) == 0) {
        mA.set(t, mN);
      }
    }
    return Z.valueOf(mA.get(mP) * 2);
  }
}
