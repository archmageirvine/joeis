package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025541 a(n) = (1/C(0,0) + 1/C(2,1) + ... + 1/C(2n,n))*L, where L = LCM{C(0,0), C(2,1),..., C(2n,n)}.
 * @author Sean A. Irvine
 */
public class A025541 implements Sequence {

  private long mN = -1;
  private Z mL = Z.ONE;
  private Q mA = Q.ZERO;

  @Override
  public Z next() {
    final Z b = Binomial.binomial(2 * ++mN, mN);
    mL = mL.lcm(b);
    mA = mA.add(new Q(Z.ONE, b));
    return mA.multiply(mL).toZ();
  }
}
