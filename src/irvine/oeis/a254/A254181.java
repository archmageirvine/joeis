package irvine.oeis.a254;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A254181 Decimal expansion of reduced Planck constant (in joule seconds).
 * @author Sean A. Irvine
 */
public class A254181 extends DecimalExpansionSequence {

  private static final CR N = PhysicsConstants.HBAR_CR.multiply(Z.TEN.pow(33));

  @Override
  protected CR getCR() {
    return N;
  }
}
