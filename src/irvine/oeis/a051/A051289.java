package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051287.
 * @author Sean A. Irvine
 */
public class A051289 extends A051287 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(p(2 * mN + 1, mN, 2 * mM + 1));
  }
}
