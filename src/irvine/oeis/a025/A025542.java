package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025542 <code>(1/binomial(0,0) - 1/binomial(2,1) + ... + d/binomial(2n,n))*L</code>, where d <code>= (-1)^n, L = LCM{binomial(0,0), binomial(2,1),..., binomial(2n,n)}</code>.
 * @author Sean A. Irvine
 */
public class A025542 implements Sequence {

  private long mN = -1;
  private Z mL = Z.ONE;
  private Q mA = Q.ZERO;

  @Override
  public Z next() {
    final Z b = Binomial.binomial(2 * ++mN, mN);
    mL = mL.lcm(b);
    mA = mA.signedAdd((mN & 1) == 0, new Q(Z.ONE, b));
    return mA.multiply(mL).toZ();
  }
}
