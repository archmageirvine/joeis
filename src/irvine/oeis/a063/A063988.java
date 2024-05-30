package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A063988 Triangle in which n-th row gives quadratic non-residues modulo the n-th prime.
 * @author Sean A. Irvine
 */
public class A063988 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 3;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mP) {
        mP = mPrime.nextPrime(mP);
        mM = 1;
      }
      if (Functions.JACOBI.i(mM, mP) == -1) {
        return Z.valueOf(mM);
      }
    }
  }
}
