package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007918 Least prime &gt;= n (version 1 of the "next prime" function).
 * @author Sean A. Irvine
 */
public class A007918 extends Sequence0 {

  protected final Fast mPrime = new Fast();
  protected Z mN = Z.NEG_ONE;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mP)) {
      mP = mPrime.nextPrime(mP);
      return mN;
    }
    return mP;
  }
}
