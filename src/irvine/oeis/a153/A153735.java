package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153735 Decimal expansion of log_23 (7).
 * @author Sean A. Irvine
 */
public class A153735 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153735() {
    super(0, CR.SEVEN.log().divide(CR.valueOf(23).log()));
  }
}
