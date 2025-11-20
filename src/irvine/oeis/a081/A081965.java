package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081965 Diagonal of A081964.
 * @author Sean A. Irvine
 */
public class A081965 extends A081964 {

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
