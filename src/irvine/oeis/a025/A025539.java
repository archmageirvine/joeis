package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025539 a(n) = (Sum{1/C(i,j)})*LCM{C(i,j)}, 0 &lt;= j &lt;= i &lt;= n.
 * @author Sean A. Irvine
 */
public class A025539 implements Sequence {

  private long mN = -1;
  private Z mL = Z.ONE;
  private Q mA = Q.ZERO;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      final Z b = Binomial.binomial(mN, k);
      mL = mL.lcm(b);
      mA = mA.add(new Q(Z.ONE, b));
    }
    return mA.multiply(mL).toZ();
  }
}
