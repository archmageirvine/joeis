package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060771 Upper ends of record prime gaps under consideration of the prime number theorem.
 * @author Sean A. Irvine
 */
public class A060771 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private CR mBest = CR.valueOf(-1);

  @Override
  public Z next() {
    while (true) {
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      final CR crp = CR.valueOf(mP);
      final CR crq = CR.valueOf(q);
      final CR r = crp.divide(crp.log()).subtract(crq.divide(crq.log()));
      if (r.compareTo(mBest) > 0) {
        mBest = r;
        return Z.valueOf(mP);
      }
    }
  }
}
