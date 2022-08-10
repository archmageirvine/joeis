package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a008.A008300;

/**
 * A058528 Number of n X n (0,1) matrices with all column and row sums equal to 4.
 * @author Sean A. Irvine
 */
public class A058528 extends A008300 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
