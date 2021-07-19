package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155061 Decimal expansion of log_9 (19).
 * @author Sean A. Irvine
 */
public class A155061 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155061() {
    super(CR.valueOf(19).log().divide(CR.NINE.log()));
  }
}
