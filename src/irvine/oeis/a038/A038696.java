package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038696 Nextprime(2^0)*nextprime(2^1)*nextprime(2^2)*...*nextprime(2^n).
 * @author Sean A. Irvine
 */
public class A038696 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mT = null;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply2();
    mProd = mProd.multiply(mPrime.nextPrime(mT));
    return mProd;
  }
}
