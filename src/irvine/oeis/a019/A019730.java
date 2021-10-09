package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019730 Decimal expansion of sqrt(2*Pi)/7.
 * @author Sean A. Irvine
 */
public class A019730 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019730() {
    super(CR.TAU.sqrt().divide(CR.SEVEN));
  }
}
