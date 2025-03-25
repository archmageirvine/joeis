package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a006.A006460;

/**
 * A076087 a(n) = 7*n - 3 * Sum_{i=1..n} A006460(i).
 * @author Sean A. Irvine
 */
public class A076087 extends A006460 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(7).subtract(super.next().multiply(3));
    return mSum;
  }
}
