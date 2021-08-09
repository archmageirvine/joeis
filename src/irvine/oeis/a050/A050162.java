package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050162 T(n,k)=S(2n+2,n-1,k-1), 0&lt;=k&lt;=n, n &gt;= 0, array S as in A050157.
 * @author Sean A. Irvine
 */
public class A050162 extends A050154 {

  private int mN = -1;
  private int mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mSum = Z.ZERO;
    }
    mSum = mSum.add(get(mN, mM));
    return mSum;
  }
}
