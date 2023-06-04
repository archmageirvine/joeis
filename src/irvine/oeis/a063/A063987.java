package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063987 Irregular triangle in which n-th row gives quadratic residues modulo the n-th prime.
 * @author Sean A. Irvine
 */
public class A063987 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mM = 0;

  @Override
  public Z next() {
    if (mP == 2) {
      mP = 3;
      return Z.ONE;
    }
    while (true) {
      if (++mM >= mP) {
        mP = mPrime.nextPrime(mP);
        mM = 1;
      }
      if (LongUtils.jacobi(mM, mP) == 1) {
        return Z.valueOf(mM);
      }
    }
  }
}
