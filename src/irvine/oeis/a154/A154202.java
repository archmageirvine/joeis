package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154202 Decimal expansion of log_9 (12).
 * @author Sean A. Irvine
 */
public class A154202 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154202() {
    super(CR.valueOf(12).log().divide(CR.NINE.log()));
  }
}
