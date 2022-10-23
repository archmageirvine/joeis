package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057834 Integer nearest to 10^n / log(10^n).
 * @author Sean A. Irvine
 */
public class A057834 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    final CR z = CR.valueOf(mA);
    return z.divide(z.log()).round();
  }
}
