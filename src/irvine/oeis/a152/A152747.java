package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152747 Decimal expansion of log_9 (2).
 * @author Sean A. Irvine
 */
public class A152747 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152747() {
    super(CR.TWO.log().divide(CR.NINE.log()));
  }
}
