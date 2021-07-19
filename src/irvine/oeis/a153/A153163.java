package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153163 Decimal expansion of log_23 (4).
 * @author Sean A. Irvine
 */
public class A153163 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153163() {
    super(CR.FOUR.log().divide(CR.valueOf(23).log()));
  }
}
