package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154018 Decimal expansion of log_19 (9).
 * @author Sean A. Irvine
 */
public class A154018 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154018() {
    super(CR.NINE.log().divide(CR.valueOf(19).log()));
  }
}
