package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083107 Diagonal of A083106.
 * @author Sean A. Irvine
 */
public class A083107 extends A083106 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}

