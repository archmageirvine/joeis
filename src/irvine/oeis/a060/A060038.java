package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A060038 Triangle T(n,k) = 0 if k-th prime is a square mod the n-th prime, otherwise 1, for 1&lt;=k&lt;n.
 * @author Sean A. Irvine
 */
public class A060038 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mQ = Z.ONE;

  @Override
  public Z next() {
    mQ = mPrime.nextPrime(mQ);
    if (mQ.compareTo(mP) >= 0) {
      mP = mPrime.nextPrime(mP);
      mQ = Z.TWO;
    }
    return ZUtils.isQuadraticResidue(mQ, mP) ? Z.ZERO : Z.ONE;
  }
}
