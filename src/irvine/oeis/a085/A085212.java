package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085212 Transpose of A085211.
 * @author Sean A. Irvine
 */
public class A085212 extends A085211 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
