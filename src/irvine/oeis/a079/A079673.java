package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079673 Consider pairs (r,s) such that the polynomial (x^r+1) divides (x^s+1) and 1 &lt;= r &lt; s. This sequence gives the r values; A079581 gives the s values.
 * @author Sean A. Irvine
 */
public class A079673 extends A079581 {

  @Override
  protected Z select(final int r, final int s) {
    return Z.valueOf(r);
  }
}
