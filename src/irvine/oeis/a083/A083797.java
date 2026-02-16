package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083797 Diagonal of A083796.
 * @author Sean A. Irvine
 */
public class A083797 extends A083796 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
