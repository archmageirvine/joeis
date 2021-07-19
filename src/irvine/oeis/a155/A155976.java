package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155976 Decimal expansion of log_9 (24).
 * @author Sean A. Irvine
 */
public class A155976 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155976() {
    super(CR.valueOf(24).log().divide(CR.NINE.log()));
  }
}
