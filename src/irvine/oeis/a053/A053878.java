package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A053875.
 * @author Sean A. Irvine
 */
public class A053878 extends A002182 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z b = mA;
    mA = super.next();
    final Q t = new Q(mA, b);
    return t.num().subtract(t.den());
  }
}
