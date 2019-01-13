package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A011784.
 * @author Sean A. Irvine
 */
public class A011784 implements Sequence {

  // I don't know any easy way to generate this sequence.
  // a(n) is the sum of values in the row for n-2.

  private DynamicIntArray mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new DynamicIntArray();
      return Z.ONE;
    } else if (mA.length() == 0) {
      mA.set(0, 2);
      return Z.TWO;
    } else {
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
      return sum;
    }
  }
}
