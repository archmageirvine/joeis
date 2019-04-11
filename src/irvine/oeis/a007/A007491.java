package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007491 Smallest prime <code>&gt; n^2</code>.
 * @author Sean A. Irvine
 */
public class A007491 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mPrime.nextPrime(mN.square());
  }
}
