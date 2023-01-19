package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061035 Triangle T(m,n) = numerator of 1/m^2 - 1/n^2, n &gt;= 1, m=n,n-1,n-2,...,1.
 * @author Sean A. Irvine
 */
public class A061035 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = ++mN;
    }
    return select(new Q(1, mM * mM).subtract(new Q(1, mN * mN)));
  }
}
