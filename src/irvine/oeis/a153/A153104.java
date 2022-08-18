package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153104 Decimal expansion of log_11 (4).
 * @author Sean A. Irvine
 */
public class A153104 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153104() {
    super(0, CR.FOUR.log().divide(CR.valueOf(11).log()));
  }
}
