package irvine.oeis.a269;

import irvine.math.z.Z;

/**
 * A269925.
 * @author Sean A. Irvine
 */
public class A269925 extends A269920 {

  private int mN = 9;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN - 8) {
      ++mN;
      mM = 1;
    }
    return get(mN, 5, mM);
  }

}
