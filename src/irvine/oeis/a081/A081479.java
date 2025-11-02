package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081479 Consider the mapping f(a/b) = (a^2 +b^2)/(a+b). Taking a =1, b = 2 to start with and carrying out this mapping repeatedly on each new (reduced) rational number gives the following sequence 1/2,5/3,17/4,305/21,... Sequence contains the numerators.
 * @author Sean A. Irvine
 */
public class A081479 extends Sequence1 {

  private Q mA = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mA = mA == null ? Q.HALF : new Q(mA.num().square().add(mA.den().square()), mA.num().add(mA.den()));
    return select(mA);
  }
}
