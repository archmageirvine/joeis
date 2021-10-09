package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153622 Decimal expansion of log_12 (7).
 * @author Sean A. Irvine
 */
public class A153622 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153622() {
    super(CR.SEVEN.log().divide(CR.valueOf(12).log()));
  }
}
