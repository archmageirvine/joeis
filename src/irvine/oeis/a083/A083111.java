package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083111 Diagonal of A083110.
 * @author Sean A. Irvine
 */
public class A083111 extends A083110 {

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

