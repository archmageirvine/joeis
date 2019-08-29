package irvine.oeis.a260;

import irvine.oeis.a006.A006779;

/**
 * A260344 Coefficients <code>phi_n</code> for three-dimensional spiral self-avoiding walks on simple cubic lattice.
 * @author Sean A. Irvine
 */
public class A260344 extends A006779 {

  {
    super.next();
  }

  @Override
  protected long count(final int point) {
    final int x = x(point);
    final int y = y(point);
    final int z = z(point);
    return 6L * (x * x + y * y + z * z);
  }
}
