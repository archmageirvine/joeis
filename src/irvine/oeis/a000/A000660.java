package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000660 Boustrophedon transform of 1,1,2,3,4,5,...
 * @author Sean A. Irvine
 */
public class A000660 implements Sequence {

  private int mN = -1;

  private ArrayList<Z> mPrev = null;

  private void computeRow(final int n) {
    final ArrayList<Z> row = new ArrayList<>();
    Z p = Z.valueOf(Math.max(1, n));
    row.add(p);
    for (int k = 1; k <= n; ++k) {
      p = p.add(mPrev.get(mN - k));
      row.add(p);
    }
    mPrev = row;
  }

  @Override
  public Z next() {
    computeRow(++mN);
    return mPrev.get(mN);
  }
}
