package irvine.oeis.a269;

import irvine.math.z.Z;

/**
 * A269924.
 * @author Sean A. Irvine
 */
public class A269924 extends A269920 {

  private int mN = 7;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN - 6) {
      ++mN;
      mM = 1;
    }
    return get(mN, 4, mM);
  }

}
