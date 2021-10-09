package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A013661 Decimal expansion of Pi^2/6 = zeta(2) = Sum_{m&gt;=1} 1/m^2.
 * @author Sean A. Irvine
 */
public class A013661 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013661() {
    super(CR.PI.multiply(CR.PI).divide(CR.SIX));
  }
}
