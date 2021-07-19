package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154849 Decimal expansion of log_4 (17).
 * @author Sean A. Irvine
 */
public class A154849 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154849() {
    super(CR.valueOf(17).log().divide(CR.FOUR.log()));
  }
}
