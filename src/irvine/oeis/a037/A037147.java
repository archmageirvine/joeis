package irvine.oeis.a037;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A037147 Denominators of Fourier coefficients of Eisenstein series of degree 2 and weight 10 when evaluated at Gram(A_2)*z.
 * @author Sean A. Irvine
 */
public class A037147 extends A037146 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
