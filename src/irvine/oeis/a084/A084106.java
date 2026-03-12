package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084106 Larger difference (r-q or q-p) associated with A084105.
 * @author Sean A. Irvine
 */
public class A084106 extends Sequence1 {

  // After Hugo Pfoertner

  private final Fast mPrime = new Fast();
  private long mP2 = 2;
  private long mP3 = 3;
  private Q mR = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      final long p1 = mP2;
      mP2 = mP3;
      mP3 = mPrime.nextPrime(mP3);
      final Q q = new Q(mP2 - p1, mP3 - mP2).max(new Q(mP3 - mP2, mP2 - p1));
      if (q.compareTo(mR) > 0) {
        mR = q;
        return Z.valueOf(mP2 - p1).max(mP3 - mP2);
      }
    }
  }
}
