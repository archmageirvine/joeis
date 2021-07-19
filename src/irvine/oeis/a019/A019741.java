package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019741 Decimal expansion of e/4.
 * @author Sean A. Irvine
 */
public class A019741 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019741() {
    super(CR.E.divide(CR.FOUR));
  }
}
