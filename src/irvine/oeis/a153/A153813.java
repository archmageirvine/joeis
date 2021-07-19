package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153813 Decimal expansion of log_12 (8).
 * @author Sean A. Irvine
 */
public class A153813 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153813() {
    super(CR.EIGHT.log().divide(CR.valueOf(12).log()));
  }
}
