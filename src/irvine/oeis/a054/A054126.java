package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054126 Odd-index Fibonacci row-sum array: T(n,k)=U(2n+1,n+1+k), 0&lt;=k&lt;=n, n &gt;= 0, U the array in A054125.
 * @author Georg Fischer
 */
public class A054126 extends A054125 {

  private int mRow1 = -1;
  private int mCol1 = -1;

  @Override
  public Z next() {
    while (true) {
      ++mCol1;
      if (mCol1 > mRow1) {
        ++mRow1;
        mCol1 = 0;
      }
      final Z result = super.next();
      if ((mRow1 & 1) == 1 && mCol1 > (mRow1 >> 1)) {
        return result;
      }
    }
  }
}
