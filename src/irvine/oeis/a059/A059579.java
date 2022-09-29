package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059579 The array of A059578 read by antidiagonals in the 'up' direction.
 * @author Sean A. Irvine
 */
public class A059579 extends A059578 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN - mM, mM);
  }
}
