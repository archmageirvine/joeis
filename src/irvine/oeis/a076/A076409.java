package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076409 Sum of the quadratic residues of prime(n).
 * @author Sean A. Irvine
 */
public class A076409 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    if (mP == 1) {
      mP = 2;
      return Z.ONE;
    }
    mP = mPrime.nextPrime(mP);
    Z sum = Z.ZERO;
    for (long k = 1; k < mP; ++k) {
      if (Functions.JACOBI.i(k, mP) == 1) {
        sum = sum.add(k);
      }
    }
    return sum;
  }
}
