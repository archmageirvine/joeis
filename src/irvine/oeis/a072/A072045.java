package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A072045 Denominator of Product{prime(k)^2/(prime(k)^2 - 1) | 0&lt;k&lt;=n}, Numerator: A072044.
 * @author Sean A. Irvine
 */
public class A072045 extends A072044 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

