package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066494 Numbers n such that prime(n+1) - prime(n) = phi(n).
 * @author Sean A. Irvine
 */
public class A066494 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      if (mP - q == Euler.phiAsLong(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
