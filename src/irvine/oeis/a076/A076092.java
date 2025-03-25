package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076092 a(n) = n - 2*Sum_{i=1..n} A076182(i).
 * @author Sean A. Irvine
 */
public class A076092 extends A076182 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(1).subtract(super.next().multiply2());
    return mSum;
  }
}
