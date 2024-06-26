package irvine.oeis.a360;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A360750 Decimal expansion of the elementary charge over h-bar according to the 2019 SI system in units A/J.
 * Formula:
 * @author Georg Fischer
 */
public class A360750 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A360750() {
    super(16, PhysicsConstants.ELEMENTARY_CHARGE_CR.multiply(Z.TEN.pow(18)).divide(PhysicsConstants.HBAR_CR.multiply(Z.TEN.pow(33))));
  }
}
