package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.a054.A054892;

/**
 * A122820 Array read by rows in which n-th row contains n successive primes with least sum divisible by n.
 * @author Sean A. Irvine
 */
public class A122820 extends A054892 {

  private long mN = 0;
  private long mM = 0;
  private Z mP = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mP = super.next();
      return mP;
    }
    mP = mPrime.nextPrime(mP);
    return mP;
  }
}
