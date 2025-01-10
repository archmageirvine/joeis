package irvine.oeis.a074;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a057.A057731;

/**
 * A074859 Number of elements of S_n having the maximum possible order g(n), where g(n) is Landau's function (A000793).
 * @author Sean A. Irvine
 */
public class A074859 extends A057731 {

  {
    setOffset(0);
  }
  protected int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> p = get(++mN, 1);
    return p.coeff(p.degree());
  }
}
