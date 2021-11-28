package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054126 Odd-index Fibonacci row-sum array: T(n,k)=U(2n+1,n+1+k), 0&lt;=k&lt;=n, n &gt;= 0, U the array in A054125.
 * @author Georg Fischer
 */
public class A054126 extends A054125 {

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
      if ((mRow & 1) == 1 && mCol > (mRow >> 1)) {
        return result;
      }
    }
  }
}
