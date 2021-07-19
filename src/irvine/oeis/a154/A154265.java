package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154265 Decimal expansion of log_5 (13).
 * @author Sean A. Irvine
 */
public class A154265 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154265() {
    super(CR.valueOf(13).log().divide(CR.FIVE.log()));
  }
}
