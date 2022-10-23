package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007491 Smallest prime &gt; n^2.
 * @author Sean A. Irvine
 */
public class A007491 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mPrime.nextPrime(mN.square());
  }
}
