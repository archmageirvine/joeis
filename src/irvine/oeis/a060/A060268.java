package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060268 Distance of 2n from the closest prime.
 * @author Sean A. Irvine
 */
public class A060268 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(Math.min(mPrime.nextPrime(mN) - mN, mN - mPrime.prevPrime(mN)));
  }
}
