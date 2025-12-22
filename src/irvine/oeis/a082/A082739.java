package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082739 First column of triangle A082737.
 * @author Sean A. Irvine
 */
public class A082739 extends A082737 {

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
