package irvine.oeis.a269;

import irvine.math.z.Z;

/**
 * A269923.
 * @author Sean A. Irvine
 */
public class A269923 extends A269920 {

  private int mN = 5;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN - 4) {
      ++mN;
      mM = 1;
    }
    return get(mN, 3, mM);
  }

}
