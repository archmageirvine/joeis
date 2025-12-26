package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082824 First column of A082822.
 * @author Sean A. Irvine
 */
public class A082824 extends A082822 {

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
