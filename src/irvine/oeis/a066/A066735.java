package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036839.
 * @author Sean A. Irvine
 */
public class A066735 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      long prod = 1;
      for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
        prod *= q;
        prod %= mP;
      }
      if (prod == mP - 1) {
        return Z.valueOf(mP);
      }
    }
  }
}
