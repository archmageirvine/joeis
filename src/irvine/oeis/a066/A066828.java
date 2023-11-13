package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066828 Numbers k that divide the average of prime(k-1) and prime(k+1).
 * @author Sean A. Irvine
 */
public class A066828 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 2;
  private long mQ = 3;

  @Override
  public Z next() {
    while (true) {
      final long r = mP;
      mP = mQ;
      mQ = mPrime.nextPrime(mQ);
      if ((mQ + r) % (2 * ++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
