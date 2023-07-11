package irvine.oeis.a081;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.cons.DoubleDecimalExpansionSequence;

/**
 * A081820 Decimal expansion of the Stefan-Boltzmann constant sigma in the 2019 SI system in units Watt/(m^2*K^4).
 * @author Sean A. Irvine
 */
public class A081820 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A081820() {
    super(-7, PhysicsConstants.STEFAN_BOLTZMANN, PhysicsConstants.STEFAN_BOLTZMANN_UNC, true);
  }
}
