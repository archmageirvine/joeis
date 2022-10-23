package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007017 Number of motifs in triangular window of side n.
 * @author Sean A. Irvine
 */
public class A007017 extends Sequence0 {

  private Z[] mCounts = {Z.ONE, Z.ONE};
  private int mN = 0;

  private Z accept(final int bottomRow, final int prevRow, final int pos, final int prevBit) {
    if (pos == mN) {
      return mCounts[prevRow & ((1 << (mN - 1)) - 1)];
    }
    Z sum = Z.ZERO;
    final int bottomBits = (bottomRow >> (pos - 1)) & 3;
    switch (bottomBits) {
      case 0:
        sum = sum.add(accept(bottomRow, prevRow + (1 << (pos - 1)), pos + 1, 1));
        break;
      case 1:
        if (pos == 1 || prevBit != 1) {
          sum = sum.add(accept(bottomRow, prevRow + (1 << (pos - 1)), pos + 1, 1));
        }
        sum = sum.add(accept(bottomRow, prevRow, pos + 1, 0));
        break;
      case 2:
        sum = sum.add(accept(bottomRow, prevRow + (1 << (pos - 1)), pos + 1, 1));
        if (pos == 1 || prevBit != 0) {
          sum = sum.add(accept(bottomRow, prevRow, pos + 1, 0));
        }
        break;
      default: // 3
        sum = sum.add(accept(bottomRow, prevRow, pos + 1, 0));
        break;
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z[] newCounts = new Z[1 << mN];
      Arrays.fill(newCounts, Z.ZERO);
      for (int bottomRow = 0; bottomRow < newCounts.length; ++bottomRow) {
        newCounts[bottomRow] = accept(bottomRow, 0, 1, 0);
      }
      mCounts = newCounts;
    }
    Z sum = Z.ZERO;
    for (final Z v : mCounts) {
      sum = sum.add(v);
    }
    return sum.divide2();
  }
}

