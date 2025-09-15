package irvine.oeis.a387;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387656 Array read by ascending antidiagonals: A(n, k) = numerator(k^n/n), with k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A387656 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return select(new Q(Z.valueOf(mM).pow(mN - mM), mN - mM));
  }
}

