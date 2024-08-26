package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a003.A003159;

/**
 * A071992 a(n) = 3*n^2 + 2*n - 4 * Sum_{k=1..n} A003159(k).
 * @author Sean A. Irvine
 */
public class A071992 extends A003159 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mSum = mSum.add(super.next());
    return Z.valueOf(mN).square().multiply(3).add(2 * mN).subtract(mSum.multiply(4));
  }
}
