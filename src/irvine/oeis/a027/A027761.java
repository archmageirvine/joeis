package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027761 Numerator of <code>sum_{p</code> prime, <code>p-1</code> divides <code>2*n} 1/p</code>.
 * @author Sean A. Irvine
 */
public class A027761 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  protected Z select(final Q q) {
    return q.num();
  }

  @Override
  public Z next() {
    mN += 2;
    Q s = Q.ZERO;
    for (long p = 2; p <= mN + 1; p = mPrime.nextPrime(p)) {
      if (mN % (p - 1) == 0) {
        s = s.add(new Q(1, p));
      }
    }
    return select(s);
  }
}
