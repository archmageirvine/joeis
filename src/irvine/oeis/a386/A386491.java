package irvine.oeis.a386;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A386491 Array read by ascending antidiagonals: A(n,m) = denominator(2n*m/(m^2 + 1)), where m &gt; 0.
 * @author Sean A. Irvine
 */
public class A386491 extends A386490 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
