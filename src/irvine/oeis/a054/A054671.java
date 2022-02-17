package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A054671 Denominators of (reduced) coefficients of Laurent series for conformal mapping from exterior of unit disk onto exterior of Mandelbrot set.
 * @author Sean A. Irvine
 */
public class A054671 extends A054670 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
