package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082829 Diagonal of A082827.
 * @author Sean A. Irvine
 */
public class A082829 extends A082827 {

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
