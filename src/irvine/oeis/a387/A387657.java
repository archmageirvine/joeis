package irvine.oeis.a387;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A387657 Array read by ascending antidiagonals: A(n, k) = denominator(k^n/n), with k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A387657 extends A387656 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

