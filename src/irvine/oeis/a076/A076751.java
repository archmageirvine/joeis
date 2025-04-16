package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A076751 a(n) is the smallest composite k such that Sum_{composites j = 4, ..., k} 1/j exceeds n.
 * @author Sean A. Irvine
 */
public class A076751 extends A002808 {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    final Q n = Q.valueOf(++mN);
    Z c = null;
    while (mSum.compareTo(n) <= 0) {
      c = super.next();
      mSum = mSum.add(new Q(Z.ONE, c));
    }
    return c;
  }
}
