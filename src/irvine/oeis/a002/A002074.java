package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A002074 Denominators of coefficients in an asymptotic expansion of the confluent hypergeometric function <code>F(1-b</code>; 2; <code>4b)</code>.
 * @author Sean A. Irvine
 */
public class A002074 extends A002073 {

  @Override
  protected Z answer(final Q v) {
    return v.den();
  }
}
