package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153790 Decimal expansion of log_10 (8).
 * @author Sean A. Irvine
 */
public class A153790 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153790() {
    super(CR.EIGHT.log().divide(CR.TEN.log()));
  }
}
