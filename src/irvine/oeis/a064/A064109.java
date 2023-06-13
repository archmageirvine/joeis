package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064109 Product_{k=1..n} prime(k) - prime(4n).
 * @author Sean A. Irvine
 */
public class A064109 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mQ = 1;
  private Z mProduct = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mPrime.nextPrime(mPrime.nextPrime(mPrime.nextPrime(mP))));
    mQ = mPrime.nextPrime(mQ);
    mProduct = mProduct.multiply(mQ);
    return mProduct.subtract(mP);
  }
}
