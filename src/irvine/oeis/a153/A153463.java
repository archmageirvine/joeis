package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153463 Decimal expansion of log_7(6).
 * @author Sean A. Irvine
 */
public class A153463 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153463() {
    super(CR.SIX.log().divide(CR.SEVEN.log()));
  }
}
