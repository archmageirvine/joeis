package irvine.oeis.a070;

import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A070063 Decimal expansion of the Boltzmann constant k in the 2019 SI system in units J/K.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A070063 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A070063() {
    super(1, PhysicsConstants.BOLTZMANN_CR.multiply(Z.TEN.pow(23)));
    setOffset(-22);
  }
}
