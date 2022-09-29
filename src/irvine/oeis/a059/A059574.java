package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059574 The array described in A059513 read by antidiagonals in the 'up' direction.
 * @author Sean A. Irvine
 */
public class A059574 extends A059513 {

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
