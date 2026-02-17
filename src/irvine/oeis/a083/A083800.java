package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083799 Main diagonal of A083798.
 * @author Sean A. Irvine
 */
public class A083800 extends A083798 {

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
