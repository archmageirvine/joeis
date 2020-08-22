package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A025545 a(n) = (1/4 + 1/6 + ... + 1/c(n))*LCM{4, 6, ..., c(n)}, where c(n) = n-th composite number.
 * @author Sean A. Irvine
 */
public class A025545 extends A002808 {

  private Z mL = Z.ONE;
  private Q mA = Q.ZERO;

  @Override
  public Z next() {
    final Z c = super.next();
    mL = mL.lcm(c);
    mA = mA.add(new Q(Z.ONE, c));
    return mA.multiply(mL).toZ();
  }
}
