package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082189 Main diagonal of square array A082025.
 * @author Sean A. Irvine
 */
public class A082189 extends A082025 {

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
