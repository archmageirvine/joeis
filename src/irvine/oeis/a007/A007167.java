package irvine.oeis.a007;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A007167 Number of skeins with 2n+1 edges.
 * @author Sean A. Irvine
 */
public class A007167 extends A007166 {

  @Override
  protected Z select(final Polynomial<Z> s, final Polynomial<Z> b, final int n) {
    return s.coeff(2 * n - 1);
  }
}
