package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A081484 Consider the mapping f(a/b) = (a^2 + b)/(a^2 - b). Taking a =2, b = 1 to start with and carrying out this mapping repeatedly on each new (reduced) rational number gives the following sequence 2/1,5/3,14/11,207/185,... Sequence contains the denominators.
 * @author Sean A. Irvine
 */
public class A081484 extends A081483 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
