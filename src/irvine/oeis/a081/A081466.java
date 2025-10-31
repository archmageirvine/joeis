package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A081466 Consider the mapping f(a/b) = (a^2+b^2)/(a^2-b^2) from rationals to rationals. Starting with 2/1 (a=2, b=1) and applying the mapping to each new (reduced) rational number gives 2/1, 5/3, 17/8, 353/225, ... Sequence gives values of the denominators.
 * @author Sean A. Irvine
 */
public class A081466 extends A081465 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
