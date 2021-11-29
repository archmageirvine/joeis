package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054134 Even-index Fibonacci row-sum array: T(n,0)=U(2n,n)/2, T(n,k)=U(2n,n+k) for k=1,2,...,n, n &gt;= 0, U the array in A054125.
 * @author Georg Fischer
 */
public class A054134 extends A054125 {

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
      if ((mRow1 & 1) == 0) {
        final int rh = mRow1 >> 1;
        if (mCol1 == rh) {
          return result.divide2();
        } else if (mCol1 > rh) {
          return result;
        }
      }
    }
  }
}
