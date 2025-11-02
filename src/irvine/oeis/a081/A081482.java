package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A081482 Consider the mapping f(a/b) = (a^3 +b^3)/(a^2+b^2). Taking a =1, b = 2 to start with and carrying out this mapping repeatedly on each new (reduced) rational number gives the following sequence 1/2,9/5,427/53,39001680/92569,... Sequence contains the denominators.
 * @author Sean A. Irvine
 */
public class A081482 extends A081481 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
