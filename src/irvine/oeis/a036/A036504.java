package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036504 Numerator of n^(n-1)/n!.
 * @author Sean A. Irvine
 */
public class A036504 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return new Q(Z.valueOf(mN).pow(mN - 1), mF).num();
  }
}
