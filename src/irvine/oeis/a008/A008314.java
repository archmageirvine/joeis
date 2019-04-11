package irvine.oeis.a008;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A008314 Irregular triangle read by rows: one half of the coefficients of the expansion of <code>(2*x)^n</code> in terms of Chebyshev T-polynomials.
 * @author Sean A. Irvine
 */
public class A008314 extends A008311 {

  private final ArrayList<Z> mList = new ArrayList<>();
  private int mN = 0;

  @Override
  public Z next() {
    if (mN <= 1) {
      ++mN;
      return Z.ONE;
    }
    if (mList.isEmpty()) {
      ++mN;
      for (int k = 0; k < mN / 2; ++k) {
        mList.add(super.next());
      }
    }
    return mList.remove(mList.size() - 1);
  }
}
