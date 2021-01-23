package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027759 Numerator of Sum 1/p; p-1 | n.
 * @author Sean A. Irvine
 */
public class A027759 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  protected Z select(final Q q) {
    return q.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (long p = 2; p <= mN + 1; p = mPrime.nextPrime(p)) {
      if (mN % (p - 1) == 0) {
        s = s.add(new Q(1, p));
      }
    }
    return select(s);
  }
}
