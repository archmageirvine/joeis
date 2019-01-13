package irvine.oeis.a007;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A007162.
 * @author Sean A. Irvine
 */
public class A007162 extends A007161 {

  @Override
  protected Z select(final Polynomial<Z> c, final Polynomial<Z> d, final int n) {
    return d.coeff(2 * n - 1);
  }
}
