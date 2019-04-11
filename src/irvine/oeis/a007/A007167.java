package irvine.oeis.a007;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A007167 Number of skeins with <code>2n+1</code> edges.
 * @author Sean A. Irvine
 */
public class A007167 extends A007166 {

  @Override
  protected Z select(final Polynomial<Z> s, final Polynomial<Z> b, final int n) {
    return s.coeff(2 * n - 1);
  }
}
