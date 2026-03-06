package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084030 Main diagonal of triangle A084029.
 * @author Sean A. Irvine
 */
public class A084030 extends A084029 {

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

