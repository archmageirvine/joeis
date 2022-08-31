package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A081824 Decimal expansion of conductance quantum in units of S.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A081824 extends DecimalExpansionSequence {

  /** Conductance quantum G_0 in S. */
  private static final CR CONDUCTANCE_QUANTUM = PhysicsConstants.ELEMENTARY_CHARGE_CR.multiply(PhysicsConstants.ELEMENTARY_CHARGE_CR).multiply(CR.TWO).divide(PhysicsConstants.PLANCK_CONSTANT_CR).multiply(10000);

  /** Construct the sequence. */
  public A081824() {
    super(1, CONDUCTANCE_QUANTUM);
  }

  @Override
  public int getOffset() {
    return -4;
  }
}
