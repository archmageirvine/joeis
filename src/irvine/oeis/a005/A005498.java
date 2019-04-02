package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a210.A210696;

/**
 * A005498 Triangulations of the disk G_{2,n}.
 * @author Sean A. Irvine
 */
public class A005498 extends A210696 {

  private int mN = -1;

  @Override
  public Z next() {
    return brownG(2, ++mN);
  }
}

