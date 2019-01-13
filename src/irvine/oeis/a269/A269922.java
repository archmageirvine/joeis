package irvine.oeis.a269;

import irvine.math.z.Z;

/**
 * A269922.
 * @author Sean A. Irvine
 */
public class A269922 extends A269920 {

  private int mN = 3;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN - 2) {
      ++mN;
      mM = 1;
    }
    return get(mN, 2, mM);
  }

}
