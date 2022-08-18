package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153629 Decimal expansion of log_19 (7).
 * @author Sean A. Irvine
 */
public class A153629 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153629() {
    super(0, CR.SEVEN.log().divide(CR.valueOf(19).log()));
  }
}
