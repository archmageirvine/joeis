package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073006.
 * @author Sean A. Irvine
 */
public class A073006 extends DecimalExpansionSequence {

  /** The constant Gamma(2/3). */
  public static final CR GAMMA_TWO_THIRDS = CR.TAU.divide(CR.THREE.sqrt()).divide(A073005.GAMMA_THIRD);

  @Override
  protected CR getCR() {
    return GAMMA_TWO_THIRDS;
  }
}
