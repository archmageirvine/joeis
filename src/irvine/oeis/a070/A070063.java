package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A070063 Decimal expansion of the Boltzmann constant k in the 2019 SI system in units <code>J/K</code>.
 * @author Sean A. Irvine
 */
public class A070063 extends DecimalExpansionSequence {

  private static final CR N = PhysicsConstants.BOLTZMANN_CR.multiply(Z.TEN.pow(23));

  @Override
  protected CR getCR() {
    return N;
  }
}
