package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153106 Decimal expansion of log_13 (4).
 * @author Sean A. Irvine
 */
public class A153106 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153106() {
    super(CR.FOUR.log().divide(CR.valueOf(13).log()));
  }
}
