package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050164 T(n,k)=S(2n+3,n+3,k+3), 0&lt;=k&lt;=n, n &gt;= 0, array S as in A050157.
 * @author Sean A. Irvine
 */
public class A050164 extends A050156 {

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
