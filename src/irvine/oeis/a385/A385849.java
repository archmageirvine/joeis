package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385849 Triangle read by rows: T(n,k) = numerator((Sum_{i=1..k} (n-i+1)^2)/(Sum_{i=1..k} i^2)), with 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A385849 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Q t(final long n, final long k) {
    return new Q(1 - 3 * k + 2 * k * k + 6 * n - 6 * k * n + 6 * n * n, 1 + 3 * k + 2 * k * k);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return select(t(mN, mM));
  }
}

