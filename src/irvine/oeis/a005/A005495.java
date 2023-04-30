package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a210.A210696;

/**
 * A005495 Number of triangulations of the disk G_{n,3}.
 * @author Sean A. Irvine
 */
public class A005495 extends A210696 {

  private int mN = -1;

  @Override
  public Z next() {
    return brownG(++mN, 3);
  }
}

