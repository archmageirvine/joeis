package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068465 Decimal expansion of Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A068465 extends DecimalExpansionSequence {

  /** The constant Gamma(3/4). */
  public static final CR GAMMA_THREE_QUARTERS = CR.PI.multiply(CR.TWO.sqrt()).divide(A068466.GAMMA_QUARTER);

  /** Construct the sequence. */
  public A068465() {
    super(GAMMA_THREE_QUARTERS);
  }
}
