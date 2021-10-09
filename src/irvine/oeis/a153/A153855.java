package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153855 Decimal expansion of log_13 (8).
 * @author Sean A. Irvine
 */
public class A153855 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153855() {
    super(CR.EIGHT.log().divide(CR.valueOf(13).log()));
  }
}
