package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A076410 (Sum of the quadratic residues of prime(n)) / prime(n).
 * @author Sean A. Irvine
 */
public class A076410 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z sum = Z.ZERO;
    for (long k = 1; k < mP; ++k) {
      if (Functions.JACOBI.i(k, mP) == 1) {
        sum = sum.add(k);
      }
    }
    return sum.divide(mP);
  }
}
