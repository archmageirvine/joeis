package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152812 Decimal expansion of log_18 (2).
 * @author Sean A. Irvine
 */
public class A152812 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152812() {
    super(0, CR.TWO.log().divide(CR.valueOf(18).log()));
  }
}
