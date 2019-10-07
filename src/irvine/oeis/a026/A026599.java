package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026599 <code>a(n) = Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=2n</code>, T given by <code>A026584</code>.
 * @author Sean A. Irvine
 */
public class A026599 extends A026584 {

  private long mN = -1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k <= 2 * mN; ++k) {
      mSum = mSum.add(get(mN, k));
    }
    return mSum;
  }
}
