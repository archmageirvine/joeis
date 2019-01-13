package irvine.oeis.a007;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A007163.
 * @author Sean A. Irvine
 */
public class A007163 extends A007161 {

  @Override
  protected Z select(final Polynomial<Z> c, final Polynomial<Z> d, final int n) {
    return RING.coeff(RING.pow(d, 2, 2 * n), RING.subtract(RING.one(), RING.pow(d, 2, 2 * n)), 2 * n);
  }
}
