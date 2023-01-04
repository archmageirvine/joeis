package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060769 "Overdue" primes: upper ends of prime gaps that are larger than the prime number theorem predicts.
 * @author Sean A. Irvine
 */
public class A060769 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 23;

  @Override
  public Z next() {
    while (true) {
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      final CR crp = CR.valueOf(mP);
      final CR crq = CR.valueOf(q);
      if (crp.divide(crp.log()).subtract(crq.divide(crq.log())).compareTo(CR.ONE) > 0) {
        return Z.valueOf(mP);
      }
    }
  }
}
