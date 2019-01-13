package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A012257.
 * @author Sean A. Irvine
 */
public class A012257 implements Sequence {

  // Cf. A011784.

  private DynamicIntArray mA = new DynamicIntArray();
  {
    mA.set(0, 2);
  }
  private int mN = 0;

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
