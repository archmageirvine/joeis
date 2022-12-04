package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060637.
 * @author Sean A. Irvine
 */
public class A060637 extends A060596 {

  {
    setOffset(0);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN + 1) {
      ++mN;
      mM = 1;
    }
    return count(mM, mN);
  }
}
