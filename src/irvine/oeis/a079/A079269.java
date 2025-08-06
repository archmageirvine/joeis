package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079269 Define b by b(1) = 1 and for n&gt;1, b(n) = b(n-1)+1/(1+1/b(n-1)); sequence gives numerator of b(n).
 * @author Sean A. Irvine
 */
public class A079269 extends Sequence1 {

  private Q mB = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mB = mB == null ? Q.ONE : mB.add(mB.reciprocal().add(1).reciprocal());
    return select(mB);
  }
}

