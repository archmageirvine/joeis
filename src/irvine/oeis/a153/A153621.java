package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153621 Decimal expansion of log_11 (7).
 * @author Sean A. Irvine
 */
public class A153621 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153621() {
    super(0, CR.SEVEN.log().divide(CR.valueOf(11).log()));
  }
}
