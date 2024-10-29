package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000134 Positive zeros of Bessel function of order 0 rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A000134 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (CrFunctions.BESSEL_J0.cr(CR.valueOf(mN).subtract(CR.HALF)).multiply(CrFunctions.BESSEL_J0.cr(CR.valueOf(mN).add(CR.HALF))).signum() > 0);
    return Z.valueOf(mN);
  }
}
