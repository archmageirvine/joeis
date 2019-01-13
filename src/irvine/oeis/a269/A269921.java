package irvine.oeis.a269;

import irvine.math.z.Z;

/**
 * A269921.
 * @author Sean A. Irvine
 */
public class A269921 extends A269920 {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, 1, mM);
  }

}
