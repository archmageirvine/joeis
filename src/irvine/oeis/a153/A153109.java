package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153109 Decimal expansion of log_17 (4).
 * @author Sean A. Irvine
 */
public class A153109 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153109() {
    super(CR.FOUR.log().divide(CR.valueOf(17).log()));
  }
}
