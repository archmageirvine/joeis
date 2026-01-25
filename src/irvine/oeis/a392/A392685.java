package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392685 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A392685 extends Sequence0 {

  private Q mSum = Q.ONE;
  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mSum = mSum.subtract(new Q(1, 4 * mN - 1)).add(new Q(1, 4 * mN + 1));
    }
    return select(mSum.divide(4 * mN + 2));
  }
}
