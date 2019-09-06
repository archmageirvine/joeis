package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025550 <code>a(n) = ( 1/1 + 1/3 + 1/5 + ... + 1/(2*n-1) )*LCM(1, 3, 5</code>, ..., <code>2*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A025550 implements Sequence {

  private Z mL = Z.ONE;
  private Q mA = Q.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    mL = mL.lcm(Z.valueOf(mN));
    mA = mA.add(new Q(1, mN));
    return mA.multiply(mL).toZ();
  }
}
