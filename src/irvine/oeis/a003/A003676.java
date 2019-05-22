package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A003676 Decimal expansion of the Planck constant h (Joule <code>*</code> second).
 * @author Sean A. Irvine
 */
public class A003676 extends DecimalExpansionSequence {

  private static final CR N = PhysicsConstants.PLANCK_CONSTANT_CR.multiply(CR.valueOf(Z.TEN.pow(33)));

  @Override
  protected CR getCR() {
    return N;
  }
}
