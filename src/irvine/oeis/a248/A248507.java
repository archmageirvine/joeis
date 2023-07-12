package irvine.oeis.a248;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A248507 Decimal expansion of a single magnetic flux quantum Phi_0 in SI units.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A248507 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A248507() {
    super(1, PhysicsConstants.PLANCK_CONSTANT_CR.divide(PhysicsConstants.ELEMENTARY_CHARGE_CR).divide(CR.TWO).multiply(Z.TEN.pow(15)));
    setOffset(-14);
  }
}
