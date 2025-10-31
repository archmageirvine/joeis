package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081465 Consider the mapping f(a/b) = (a^2+b^2)/(a^2-b^2) from rationals to rationals. Starting with 2/1 (a=2, b=1) and applying the mapping to each new (reduced) rational number gives 2/1, 5/3, 17/8, 353/225, ... . Sequence gives values of the numerators.
 * @author Sean A. Irvine
 */
public class A081465 extends Sequence1 {

  private Q mA = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mA = mA == null ? Q.TWO : new Q(mA.num().square().add(mA.den().square()), mA.num().square().subtract(mA.den().square()));
    return select(mA);
  }
}
