package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153857 Decimal expansion of log_15 (8).
 * @author Sean A. Irvine
 */
public class A153857 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153857() {
    super(CR.EIGHT.log().divide(CR.valueOf(15).log()));
  }
}
