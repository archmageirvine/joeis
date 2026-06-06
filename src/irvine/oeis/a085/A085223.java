package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085223 Row 1 of A085201.
 * @author Sean A. Irvine
 */
public class A085223 extends A085201 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 1);
  }
}
