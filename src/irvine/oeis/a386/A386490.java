package irvine.oeis.a386;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386490 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A386490 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  protected Q t(final long n, final long m) {
    return new Q(2 * n * m, m * m + 1);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return select(t(mN - mM, mM + 1));
  }
}
