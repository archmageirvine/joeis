package irvine.oeis.a383;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A383891 allocated for Xiaoliang Zhang.
 * @author Sean A. Irvine
 */
public class A383891 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 2;

  @Override
  public Z next() {
    final Q t = new Q(1, ++mN);
    Q sum = Q.ZERO;
    long cnt = 0;
    while (sum.compareTo(t) < 0) {
      ++cnt;
      sum = sum.add(new Q(1, mP));
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(cnt);
  }
}
