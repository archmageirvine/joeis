package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a053.A053666;

/**
 * A069802 Primes related to the nondecreasing subsequence of A053666.
 * @author Sean A. Irvine
 */
public class A069802 extends A053666 {

  private Z mP = Z.ZERO;
  private Z mT = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z q = super.next();
      if (q.compareTo(mT) >= 0) {
        mT = q;
        return mP;
      }
    }
  }
}

