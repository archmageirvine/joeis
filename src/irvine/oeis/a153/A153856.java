package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153856 Decimal expansion of log_14 (8).
 * @author Sean A. Irvine
 */
public class A153856 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153856() {
    super(CR.EIGHT.log().divide(CR.valueOf(14).log()));
  }
}
