package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063181 The array of A063179 read by diagonals in the 'up' direction.
 * @author Sean A. Irvine
 */
public class A063181 extends A063179 {

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
