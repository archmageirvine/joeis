package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026583 a(n) = Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=2n, T given by A026568.
 * @author Sean A. Irvine
 */
public class A026583 extends A026568 {

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
