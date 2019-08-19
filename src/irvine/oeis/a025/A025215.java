package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A025215 <code>a(n) = [</code> Sum of squares of <code>1 + 1/2 + ... + 1/k ], k = 1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A025215 extends A025212 {

  private int mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(h(++mN).square());
    return mSum.floor();
  }
}
