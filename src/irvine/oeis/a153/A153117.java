package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153117 Decimal expansion of log_19 (4).
 * @author Sean A. Irvine
 */
public class A153117 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153117() {
    super(CR.FOUR.log().divide(CR.valueOf(19).log()));
  }
}
