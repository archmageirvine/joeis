package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082231 Main diagonal of A082228.
 * @author Sean A. Irvine
 */
public class A082231 extends A082228 {

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
