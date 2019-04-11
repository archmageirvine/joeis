package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A001304 Expansion of <code>1/((1-x)^2*(1-x^2)*(1-x^5))</code>.
 * @author Sean A. Irvine
 */
public class A001304 extends A001312 {

  @Override
  protected int[] coins() {
    return new int[] {2, 5};
  }

  @Override
  protected Polynomial<Z> den() {
    return RING.multiply(super.den(), Polynomial.create(1, -2, 1));
  }
}
