package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083777 Diagonal of A083776.
 * @author Sean A. Irvine
 */
public class A083777 extends A083776 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
