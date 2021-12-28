package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059319 Number of 1's in row n of Pascal's rhombus mod 2.
 * @author Georg Fischer
 */
public class A059319 extends A059318 {

  protected Z mSum1 = Z.ZERO;
  protected Z mSum0;

  @Override
  public Z next() {
    while (true) {
      final Z term = super.next();
      mSum1 = mSum1.add(term);
      //System.out.println("mRow=" + mRow + ", mCol=" + mCol + ", term=" + term + ", mSum1=" + mSum1);
      if (mCol == mRow) {
        final Z result = mSum1;
        mSum0 = Z.valueOf(mRow + 1).subtract(mSum1);
        mSum1 = Z.ZERO;
        return result;
      }
    }
  }
}
