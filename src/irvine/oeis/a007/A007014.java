package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007014 Largest prime &lt;= Product prime(k).
 * @author Sean A. Irvine
 */
public class A007014 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mProduct = Z.ONE;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mProduct = mProduct.multiply(mP);
    return mPrime.prevPrime(mProduct.add(1));
  }
}

