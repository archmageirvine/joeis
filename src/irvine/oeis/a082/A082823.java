package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082823 Diagonal of A082822.
 * @author Sean A. Irvine
 */
public class A082823 extends A082822 {

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
