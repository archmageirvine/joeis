package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073833 Numerators of b(n) where b(1) = 1, b(i) = b(i-1) + 1/b(i-1).
 * @author Sean A. Irvine
 */
public class A073833 extends Sequence1 {

  private Q mB = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mB = mB == null ? Q.ONE : mB.add(mB.reciprocal());
    return select(mB);
  }
}
