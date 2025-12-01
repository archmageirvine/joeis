package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082227 Main diagonal of array A082224.
 * @author Sean A. Irvine
 */
public class A082227 extends A082224 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < 4 * mN - 1; ++k) {
      super.next();
    }
    return super.next();
  }
}
