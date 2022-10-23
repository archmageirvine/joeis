package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047920 Triangular array formed from successive differences of factorial numbers.
 * @author Sean A. Irvine
 */
public class A047920 extends Sequence0 {

  private int mN = -1;
  private Z[] mRow = {Z.ONE};

  @Override
  public Z next() {
    if (++mN >= mRow.length) {
      final Z[] r = mRow;
      mRow = new Z[mRow.length + 1];
      mRow[0] = r[0].multiply(r.length);
      for (int k = 1; k < mRow.length; ++k) {
        mRow[k] = mRow[k - 1].subtract(r[k - 1]);
      }
      mN = 0;
    }
    return mRow[mN];
  }
}
