package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081461 Consider the mapping f(a/b) = (a^2+b^3)/(a^3+b^2) from rationals to rationals. Starting with 1/2 (a=1, b=2) and applying the mapping to each new (reduced) rational number gives 1/2, 9/5, 103/377, ... . Sequence gives values of the numerators.
 * @author Sean A. Irvine
 */
public class A081461 extends Sequence1 {

  private Q mA = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mA = mA == null ? Q.HALF : new Q(mA.num().square().add(mA.den().pow(3)), mA.num().pow(3).add(mA.den().square()));
    return select(mA);
  }
}
