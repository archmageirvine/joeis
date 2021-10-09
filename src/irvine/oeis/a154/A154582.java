package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154582 Decimal expansion of log_12 (15).
 * @author Sean A. Irvine
 */
public class A154582 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154582() {
    super(CR.valueOf(15).log().divide(CR.valueOf(12).log()));
  }
}
