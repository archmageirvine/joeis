package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A081480 Consider the mapping f(a/b) = (a^2 +b^2)/(a+b). Taking a =1, b = 2 to start with and carrying out this mapping repeatedly on each new (reduced) rational number gives the following sequence 1/2,5/3,17/4,305/21,... Sequence contains the denominators.
 * @author Sean A. Irvine
 */
public class A081480 extends A081479 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
