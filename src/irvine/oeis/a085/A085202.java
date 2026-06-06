package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085202 Transpose of A085201.
 * @author Sean A. Irvine
 */
public class A085202 extends A085201 {

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
