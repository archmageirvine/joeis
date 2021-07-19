package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154339 Decimal expansion of log_9 (13).
 * @author Sean A. Irvine
 */
public class A154339 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154339() {
    super(CR.valueOf(13).log().divide(CR.NINE.log()));
  }
}
