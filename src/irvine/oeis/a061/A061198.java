package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061198.
 * @author Sean A. Irvine
 */
public class A061198 extends A061199 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
