package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076842 extends Sequence1 {

  private Q mA = null;
  private Q mB = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Q.ONE;
      } else {
        mB = Q.ONE;
      }
      return select(Q.ONE);
    }
    final Q t = mA.add(mB).add(1).divide(mA);
    mA = mB;
    mB = t;
    return select(t);
  }
}
