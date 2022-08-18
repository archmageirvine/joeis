package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A059956 Decimal expansion of 6/Pi^2.
 * @author Sean A. Irvine
 */
public class A059956 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A059956() {
    super(0, CR.SIX.divide(CR.PI.multiply(CR.PI)));
  }
}
