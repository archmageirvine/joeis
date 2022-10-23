package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051699 Distance from n to closest prime.
 * @author Sean A. Irvine
 */
public class A051699 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.ZERO;
    }
    final long prev = mPrime.prevPrime(mN);
    final long next = mPrime.nextPrime(mN);
    return Z.valueOf(prev <= 0 ? next - mN : Math.min(next - mN, mN - prev));
  }
}
