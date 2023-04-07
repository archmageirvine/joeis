package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062706 The array of A062704 read by diagonals in the 'up' direction.
 * @author Sean A. Irvine
 */
public class A062706 extends A062704 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM + 1);
  }
}
