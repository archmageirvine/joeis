package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083485 Diagonal of A083486.
 * @author Sean A. Irvine
 */
public class A083485 extends A083486 {

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
