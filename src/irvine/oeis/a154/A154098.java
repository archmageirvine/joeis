package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154098 Decimal expansion of log_22 (9).
 * @author Sean A. Irvine
 */
public class A154098 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154098() {
    super(0, CR.NINE.log().divide(CR.valueOf(22).log()));
  }
}
