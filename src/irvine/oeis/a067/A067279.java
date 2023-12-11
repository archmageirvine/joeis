package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067279 Factorial expansion of zeta(2) : zeta(2) = Sum_{n&gt;=1} a(n)/n!.
 * @author Sean A. Irvine
 */
public class A067279 extends Sequence1 {

  private static final CR ZETA2 = Zeta.zeta(2);
  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z f1 = mF;
    mF = mF.multiply(mN);
    return ZETA2.multiply(mF).floor().subtract(ZETA2.multiply(f1).floor().multiply(mN));
  }
}
