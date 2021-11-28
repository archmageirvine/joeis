package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054134 Even-index Fibonacci row-sum array: T(n,0)=U(2n,n)/2, T(n,k)=U(2n,n+k) for k=1,2,...,n, n &gt;= 0, U the array in A054125.
 * @author Georg Fischer
 */
public class A054134 extends A054125 {

  protected int mRow = -1;
  protected int mCol = -1;

  @Override
  public Z next() {
    while (true) {
      ++mCol;
      if (mCol > mRow) {
        ++mRow;
        mCol = 0;
      }
      final Z result = super.next();
      if ((mRow & 1) == 0) {
        final int rh = mRow >> 1;
        if (mCol == rh) {
          return result.divide2();
        } else if (mCol > rh) {
          return result;
        }
      }
    }
  }
}
