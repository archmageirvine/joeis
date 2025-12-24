package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082819 First column of A082817.
 * @author Sean A. Irvine
 */
public class A082819 extends A082817 {

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
