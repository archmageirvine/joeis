package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064934 Smallest prime (or noncomposite) strictly greater than sum of previous terms (with a(0)=1).
 * @author Sean A. Irvine
 */
public class A064934 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z res = mA.isZero() ? Z.ONE : mPrime.nextPrime(mA);
    mA = mA.add(res);
    return res;
  }
}
