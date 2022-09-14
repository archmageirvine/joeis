package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059234 The array in A059216 read by antidiagonals in the direction in which it was constructed.
 * @author Sean A. Irvine
 */
public class A059234 extends A059216 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, (mN & 1) == 1 ? mM : mN - mM);
  }
}
