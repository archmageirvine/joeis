package irvine.oeis.a080;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080984 extends Sequence1 {

  private Q mB = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (mB == null) {
      mB = Q.ONE;
    } else {
      mB = mB.add(mB.reciprocal().add(2).reciprocal());
    }
    return select(mB);
  }
}

