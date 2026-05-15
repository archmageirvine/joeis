package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084838 Smallest integers that satisfy Sum_{n&gt;0} mu(a(n)) / a(n) = 0 by requiring that the absolute value of the successive partial sums are monotonically decreasing in magnitude, where a(1)=1 and a(n+1)&gt;a(n) for n&gt;0.
 * @author Sean A. Irvine
 */
public class A084838 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Q mS = Q.ZERO;
  private Q mW = Q.TWO;

  @Override
  public Z next() {
    mA = mA.add(1);
    while (mS.add(new Q(Functions.MOBIUS.l(mA), mA)).abs().compareTo(mW) >= 0) {
      mA = mA.add(1);
    }
    mS = mS.add(new Q(Functions.MOBIUS.l(mA), mA));
    mW = mS.abs();
    return mA;
  }
}
