package irvine.oeis.a136;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A136671 a(1)=1, a(n) = floor(a(n-1) * exp(Pi/4)).
 * @author Sean A. Irvine
 */
public class A136671 extends Sequence1 {

  private static final CR C = CR.PI.divide(4).exp();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = C.multiply(mA).floor();
    }
    return mA;
  }
}
