package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082738 Diagonal of triangle in A082737.
 * @author Sean A. Irvine
 */
public class A082738 extends A082737 {

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
