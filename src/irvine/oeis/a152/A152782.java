package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152782 Decimal expansion of log_17 (2).
 * @author Sean A. Irvine
 */
public class A152782 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152782() {
    super(0, CR.TWO.log().divide(CR.valueOf(17).log()));
  }
}
