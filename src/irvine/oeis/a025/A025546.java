package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A025546 (1/4 - 1/6 + ... + d/c(n))*LCM{4, 6, ..., c(n)}, where d = (-1)^(n-1), c(n) = n-th composite number.
 * @author Sean A. Irvine
 */
public class A025546 extends A002808 {

  private Z mL = Z.ONE;
  private Q mA = Q.ZERO;
  private boolean mSign = false;

  @Override
  public Z next() {
    final Z c = super.next();
    mL = mL.lcm(c);
    mSign = !mSign;
    mA = mA.signedAdd(mSign, new Q(Z.ONE, c));
    return mA.multiply(mL).toZ();
  }
}
