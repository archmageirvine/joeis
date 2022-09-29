package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059575 The array described in A059513 read by antidiagonals in the direction of construction.
 * @author Sean A. Irvine
 */
public class A059575 extends A059513 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return (mN & 1) == 1 ? get(mN - mM, mM) : get(mM, mN - mM);
  }
}
