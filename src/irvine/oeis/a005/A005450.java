package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005450 Numerator of (1 + Gamma(n))/n.
 * @author Sean A. Irvine
 */
public class A005450 extends Sequence1 {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return new Q(mF.add(1), mN + 1).num();
  }
}
