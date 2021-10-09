package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154197 Decimal expansion of log_4 (12).
 * @author Sean A. Irvine
 */
public class A154197 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154197() {
    super(CR.valueOf(12).log().divide(CR.FOUR.log()));
  }
}
