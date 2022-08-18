package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152882 Decimal expansion of log_23 (2).
 * @author Sean A. Irvine
 */
public class A152882 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152882() {
    super(0, CR.TWO.log().divide(CR.valueOf(23).log()));
  }
}
