package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002143 Class numbers h(-p) where p runs through the primes p == 3 (mod 4).
 * @author Sean A. Irvine
 */
public class A002143 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 3) == 3) {
        return Z.valueOf(LongUtils.classNumber(-mP));
      }
    }
  }
}
