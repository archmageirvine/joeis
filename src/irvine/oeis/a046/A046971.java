package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046971 Maximal value of number of unitary divisors (see A034444) for integers in binary order range of n.
 * @author Sean A. Irvine
 */
public class A046971 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mQ = 2;
  private Z mA = null;
  private long mM = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.TWO;
    } else if (--mM < 0) {
      mQ = mPrime.nextPrime(mQ);
      mA = mA.multiply2();
      final Z t = mP.multiply(mQ);
      mM = t.bitLength() - mP.bitLength() - 1;
      mP = t;
    }
    return mA;
  }
}
