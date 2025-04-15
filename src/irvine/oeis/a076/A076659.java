package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A076659 Denominator of f(n), where for n&gt;2, f(n) = (n-1)/f(n-1)+(n-2)/f(n-2), with f(1) = 1, f(2) = 2.
 * @author Sean A. Irvine
 */
public class A076659 extends A076658 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
