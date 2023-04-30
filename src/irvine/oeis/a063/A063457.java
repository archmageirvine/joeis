package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063457 a(n) = floor(a(n-1)*(Pi-1)); a(1) = 1.
 * @author Sean A. Irvine
 */
public class A063457 extends Sequence1 {

  private static final CR PI1 = CR.PI.subtract(CR.ONE);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : PI1.multiply(mA).floor();
    return mA;
  }
}
