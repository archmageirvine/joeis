package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066400/
 * @author Sean A. Irvine
 */
public class A066448 extends A066447 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
