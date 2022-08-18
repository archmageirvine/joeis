package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153618 Decimal expansion of log_8 (7).
 * @author Sean A. Irvine
 */
public class A153618 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153618() {
    super(0, CR.SEVEN.log().divide(CR.EIGHT.log()));
  }
}
