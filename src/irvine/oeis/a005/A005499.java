package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a210.A210696;

/**
 * A005499 Triangulations of the disk <code>G_{3,n}</code>.
 * @author Sean A. Irvine
 */
public class A005499 extends A210696 {

  private int mN = -1;

  @Override
  public Z next() {
    return brownG(3, ++mN);
  }
}

