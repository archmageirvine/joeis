package irvine.oeis.a260;

import irvine.oeis.a006.A006780;

/**
 * A260345 Sum of squared distances from origin to ends of all n-step anisotropic self-avoiding walks on simple cubic lattice.
 * @author Sean A. Irvine
 */
public class A260345 extends A006780 {

  /** Construct the sequence. */
  public A260345() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  protected long count(final int point) {
    final int x = x(point);
    final int y = y(point);
    final int z = z(point);
    return 2L * (x * x + y * y + z * z);
  }
}
