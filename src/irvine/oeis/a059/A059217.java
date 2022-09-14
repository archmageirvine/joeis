package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059217 The array in A059216 read by antidiagonals in 'up' direction.
 * @author Sean A. Irvine
 */
public class A059217 extends A059216 {

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
