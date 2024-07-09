package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A071301 Denominator of b(n), where b(n+1) = Sum_{k=0..n} b'((n^2-k^2)/n), b(0) = b(1) = 1, and b'(x) = b(x) if x is an integer and is linearly interpolated otherwise.
 * @author Sean A. Irvine
 */
public class A071301 extends A071300 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
