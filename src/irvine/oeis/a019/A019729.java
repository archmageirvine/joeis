package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019729 Decimal expansion of sqrt(2*Pi)/5.
 * @author Sean A. Irvine
 */
public class A019729 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019729() {
    super(CR.TAU.sqrt().divide(CR.FIVE));
  }
}
