package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152590 Decimal expansion of log_2(13).
 * @author Sean A. Irvine
 */
public class A152590 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152590() {
    super(CR.valueOf(13).log().divide(CR.TWO.log()));
  }
}
