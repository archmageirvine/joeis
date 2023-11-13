package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066826 Numbers k that divide the average of prime(k-1) and prime(k).
 * @author Sean A. Irvine
 */
public class A066826 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 2;
  private long mP = 3;

  @Override
  public Z next() {
    while (true) {
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      if ((mP + q) % (2 * ++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
