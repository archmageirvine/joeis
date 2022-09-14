package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059220 The array in A059219 read by antidiagonals in 'up' direction.
 * @author Sean A. Irvine
 */
public class A059220 extends A059219 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
