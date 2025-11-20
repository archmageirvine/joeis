package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081958 Diagonal of A081957.
 * @author Sean A. Irvine
 */
public class A081958 extends A081957 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (int k = 1; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
