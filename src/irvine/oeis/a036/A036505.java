package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036505 Numerator of (n+1)^n/n!.
 * @author Sean A. Irvine
 */
public class A036505 extends Sequence0 {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
    }
    return new Q(Z.valueOf(mN + 1).pow(mN), mF).num();
  }
}
