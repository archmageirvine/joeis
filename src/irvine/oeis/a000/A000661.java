package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000661 Shifts 2 places left under boustrophedon transform.
 * @author Sean A. Irvine
 */
public class A000661 implements Sequence {

  private int mN = -1;

  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(Z.ONE);
    mA.add(Z.ZERO);
  }
  private ArrayList<Z> mPrev = null;

  private void computeRow(final int n) {
    final ArrayList<Z> row = new ArrayList<>();
    Z p = mA.get(n);
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
    mA.add(mPrev.get(mN));
    return mA.get(mN);
  }
}
