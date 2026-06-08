package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085225 Row 1 of A085203.
 * @author Sean A. Irvine
 */
public class A085225 extends A085203 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 1);
  }
}
