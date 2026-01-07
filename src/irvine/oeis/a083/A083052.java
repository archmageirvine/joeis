package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083052 Main diagonal of table A083050.
 * @author Sean A. Irvine
 */
public class A083052 extends A083050 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < 4 * mN - 1; ++k) {
      super.next();
    }
    return super.next();
  }
}

