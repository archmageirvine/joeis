package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083169 First column of A083167.
 * @author Sean A. Irvine
 */
public class A083169 extends A083167 {

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

