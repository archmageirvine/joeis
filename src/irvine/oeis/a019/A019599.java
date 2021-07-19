package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019599 Decimal expansion of 2*Pi*e/5.
 * @author Sean A. Irvine
 */
public class A019599 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019599() {
    super(CR.TAU.multiply(CR.E).divide(CR.FIVE));
  }
}
