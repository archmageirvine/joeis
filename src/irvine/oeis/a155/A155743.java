package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155743 Decimal expansion of log_9 (22).
 * @author Sean A. Irvine
 */
public class A155743 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155743() {
    super(CR.valueOf(22).log().divide(CR.NINE.log()));
  }
}
