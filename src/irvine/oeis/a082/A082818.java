package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082818 Diagonal of A082817.
 * @author Sean A. Irvine
 */
public class A082818 extends A082817 {

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
