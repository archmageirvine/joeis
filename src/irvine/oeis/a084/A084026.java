package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084026 Diagonal of A084024.
 * @author Sean A. Irvine
 */
public class A084026 extends A084024 {

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

