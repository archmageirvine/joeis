package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066895 Numbers k such that k divides prime(k) + prime(k+1).
 * @author Sean A. Irvine
 */
public class A066895 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long t = mP;
      mP = mPrime.nextPrime(mP);
      if ((t + mP) % ++mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

