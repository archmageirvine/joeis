package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067277 Factorial expansion of zeta(3): zeta(3) = Sum_{n&gt;=1} a(n)/n!.
 * @author Sean A. Irvine
 */
public class A067277 extends Sequence1 {

  private static final CR ZETA3 = Zeta.zeta(3);
  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z f1 = mF;
    mF = mF.multiply(mN);
    return ZETA3.multiply(mF).floor().subtract(ZETA3.multiply(f1).floor().multiply(mN));
  }
}
