package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081481 Consider the mapping f(a/b) = (a^3 +b^3)/(a^2+b^2). Taking a =1, b = 2 to start with and carrying out this mapping repeatedly on each new (reduced) rational number gives the following sequence 1/2,9/5,427/53,39001680/92569,... Sequence contains the numerator.
 * @author Sean A. Irvine
 */
public class A081481 extends Sequence1 {

  private Q mA = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mA = mA == null ? Q.HALF : new Q(mA.num().pow(3).add(mA.den().pow(3)), mA.num().square().add(mA.den().square()));
    return select(mA);
  }
}
