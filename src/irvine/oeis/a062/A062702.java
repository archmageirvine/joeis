package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062702 Index of factorial primes of form m!-1.
 * @author Sean A. Irvine
 */
public class A062702 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mM = 0;
  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      final Z t = mF.subtract(1);
      if (t.isProbablePrime()) {
        while (!mP.equals(t)) {
          mP = mPrime.nextPrime(mP);
          ++mM;
        }
        return Z.valueOf(mM);
      }
    }
  }
}
