package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081483 Consider the mapping f(a/b) = (a^2 + b)/(a^2 - b). Taking a =2, b = 1 to start with and carrying out this mapping repeatedly on each new (reduced) rational number gives the following sequence 2/1,5/3,14/11,207/185,... Sequence contains the numerator.
 * @author Sean A. Irvine
 */
public class A081483 extends Sequence1 {

  private Q mA = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mA = mA == null ? Q.TWO : new Q(mA.num().square().add(mA.den()), mA.num().square().subtract(mA.den()));
    return select(mA);
  }
}
