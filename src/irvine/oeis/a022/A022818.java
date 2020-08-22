package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022818 Square array read by antidiagonals: A(n,k) = number of terms in the n-th derivative of a function composed with itself k times (n, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A022818 extends A022811 {

  private long mD = 1;
  private long mN = 1;

  @Override
  public Z next() {
    if (++mN >= mD) {
      ++mD;
      mN = 1;
    }
    return get(mN, mD - mN);
  }
}
