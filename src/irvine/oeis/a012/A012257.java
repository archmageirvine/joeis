package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicIntArray;

/**
 * A012257 Irregular triangle read by rows: row 0 is {2}; if row n is {r_1, ..., r_k} then row n+1 is {r_k 1's, r_{k-1} 2's, r_{k-2} 3's, etc.}.
 * @author Sean A. Irvine
 */
public class A012257 extends Sequence0 {

  // Cf. A011784.

  private DynamicIntArray mA = new DynamicIntArray();
  {
    mA.set(0, 2);
  }
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      if (mA.length() == 139759600) {
        // Next line would overflow int
        throw new UnsupportedOperationException();
      }
      final DynamicIntArray newRow = new DynamicIntArray();
      Z sum = Z.ZERO;
      for (int j = mA.length() - 1, k = 0, l = 1; j >= 0; --j, ++l) {
        sum = sum.add(Z.valueOf(mA.get(j)).multiply(l));
        for (int i = 0; i < mA.get(j); ++i, ++k) {
          newRow.set(k, l);
        }
      }
      mA = newRow;
      mN = 0;
    }
    return Z.valueOf(mA.get(mN));
  }
}
