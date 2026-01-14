package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083168 Diagonal of A083167.
 * @author Sean A. Irvine
 */
public class A083168 extends A083167 {

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

