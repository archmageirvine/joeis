package irvine.oeis.a037;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A037149 Denominators of Fourier coefficients of Eisenstein series of degree 2 and weight 12 when evaluated at Gram(A_2)*z.
 * @author Sean A. Irvine
 */
public class A037149 extends A037148 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
