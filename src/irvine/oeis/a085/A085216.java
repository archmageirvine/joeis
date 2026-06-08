package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085216 Transpose of A085215.
 * @author Sean A. Irvine
 */
public class A085216 extends A085215 {

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
