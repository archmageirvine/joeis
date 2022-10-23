package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051700 Distance from n to closest prime that is different from n.
 * @author Sean A. Irvine
 */
public class A051700 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final long prev = mPrime.prevPrime(++mN);
    final long next = mPrime.nextPrime(mN);
    return Z.valueOf(prev <= 0 ? next - mN : Math.min(next - mN, mN - prev));
  }
}
