package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a008.A008300;

/**
 * A058527 Number of 2n X 2n 0-1 matrices with n ones in each row and each column.
 * @author Sean A. Irvine
 */
public class A058527 extends A008300 {

  // Too slow to be useful ...
  // A cycle index approach probably exists

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      step();
    }
    step();
    return coeff(mP, mN);
  }
}
