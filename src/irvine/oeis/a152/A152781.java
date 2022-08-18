package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152781 Decimal expansion of log_15 (2).
 * @author Sean A. Irvine
 */
public class A152781 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152781() {
    super(0, CR.TWO.log().divide(CR.valueOf(15).log()));
  }
}
