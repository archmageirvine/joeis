package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A060749 Triangle in which n-th row lists all primitive roots modulo the n-th prime.
 * @author Sean A. Irvine
 */
public class A060749 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mQ = Z.ZERO;

  @Override
  public Z next() {
    if (mQ.isZero()) {
      mQ = Z.ONE;
      return Z.ONE;
    }
    while (true) {
      mQ = mQ.add(1);
      if (mQ.compareTo(mP) >= 0) {
        mP = mPrime.nextPrime(mP);
        mQ = Z.TWO;
      }
      if (ZUtils.isPrimitiveRoot(mQ, mP)) {
        return mQ;
      }
    }
  }
}
