package irvine.oeis.a087;

import irvine.math.z.Z;

/**
 * A087468 Dispersion, read by antidiagonals, of the complement of row 0 of the array R in A087465.
 * @author Sean A. Irvine
 */
public class A087468 extends A087465 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM);
  }
}
