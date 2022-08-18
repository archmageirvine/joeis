package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019741 Decimal expansion of e/4.
 * @author Sean A. Irvine
 */
public class A019741 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019741() {
    super(0, CR.E.divide(CR.FOUR));
  }
}
