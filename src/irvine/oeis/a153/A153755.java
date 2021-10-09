package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153755 Decimal expansion of log_7(8).
 * @author Sean A. Irvine
 */
public class A153755 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153755() {
    super(CR.EIGHT.log().divide(CR.SEVEN.log()));
  }
}
