package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066894 Numbers k such that prime(2*k) - prime(k) == 0 (mod k).
 * @author Sean A. Irvine
 */
public class A066894 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mQ = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mPrime.nextPrime(mP));
      mQ = mPrime.nextPrime(mQ);
      if (mP.subtract(mQ).mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

