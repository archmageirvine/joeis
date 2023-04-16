package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062867 Triangle read by rows: entries give numbers of permutations of [1..n] by absolute barycenter.
 * @author Sean A. Irvine
 */
public class A062867 extends A062866 {

  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mMax) {
      step();
      mM = 0;
    }
    return mRow.get(mM).multiply(mM == 0 ? 1 : 2);
  }
}
