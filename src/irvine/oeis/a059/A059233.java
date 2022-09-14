package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicByteArray;

/**
 * A059233 Number of rows in which n appears in Pascal's triangle (A007318).
 * @author Sean A. Irvine
 */
public class A059233 implements Sequence {

  // This implementation limited to numbers of 31 bits, but could easily be
  // extended if necessary

  private final DynamicByteArray mCounts = new DynamicByteArray();
  private int mN = 1;
  private int mRow = 3;

  @Override
  public Z next() {
    if (++mN > mRow * (mRow - 1) / 2) {
      ++mRow;
      for (int k = 2; 2 * k <= mRow; ++k) {
        final Z b = Binomial.binomial(mRow, k);
        if (b.bitLength() < 32) {
          final int t = b.intValue();
          mCounts.set(t, (byte) (mCounts.get(t) + 1));
        }
      }
    }
    return Z.valueOf(mCounts.get(mN) + 1);
  }
}
