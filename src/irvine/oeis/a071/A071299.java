package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A071299 Denominators of a(n+1) = Sum_{k=0..n} a'(k^2/n), where a(0) = a(1) = 1; and a'(x) = a(x) if x is an integer and is linearly interpolated otherwise.
 * @author Sean A. Irvine
 */
public class A071299 extends A071298 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
