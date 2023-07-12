package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A025559 (1/1 - 1/3 + 1/6 + ... + d/C(n+1,2))*LCM{1,3,6,...,C(n+1,2)}, where d = (-1)^n.
 * @author Sean A. Irvine
 */
public class A025559 extends A000217 {

  private Z mL = Z.ONE;
  private Q mA = Q.ZERO;
  private boolean mSign = false;

  /** Construct the sequence. */
  public A025559() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    mSign = !mSign;
    final Z b = super.next();
    mA = mA.signedAdd(mSign, new Q(Z.ONE, b));
    mL = mL.lcm(b);
    return mA.multiply(mL).toZ();
  }
}
