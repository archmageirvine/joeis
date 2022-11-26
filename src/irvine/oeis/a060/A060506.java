package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060506 Numerators of the asymptotic expansion of the Airy function Ai(x).
 * @author Sean A. Irvine
 */
public class A060506 extends Sequence0 {

  private int mN = -1;
  private Z mDen = Z.ONE;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mDen = mDen.multiply(216).multiply(mN);
    }
    return select(new Q(Integers.SINGLETON.product(1, 3 * mN - 1, k -> Z.valueOf(2L * k + 1)), mDen));
  }
}
