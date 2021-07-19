package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153105 Decimal expansion of log_12 (4).
 * @author Sean A. Irvine
 */
public class A153105 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153105() {
    super(CR.FOUR.log().divide(CR.valueOf(12).log()));
  }
}
