package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019696 Decimal expansion of 2*Pi/9.
 * @author Sean A. Irvine
 */
public class A019696 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019696() {
    super(CR.TAU.divide(CR.NINE));
  }
}
