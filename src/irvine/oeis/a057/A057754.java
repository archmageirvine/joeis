package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057754 Integer nearest to Li(10^n), where Li(x) = integral(0..x, dt/log(t)).
 * @author Sean A. Irvine
 */
public class A057754 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CrFunctions.LI.cr(CR.valueOf(mA)).round();
  }
}
