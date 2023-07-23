package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A025215 a(n) = [ Sum of squares of 1 + 1/2 + ... + 1/k ], k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A025215 extends A025212 {

  {
    setOffset(1);
  }

  private int mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(h(++mN).square());
    return mSum.floor();
  }
}
