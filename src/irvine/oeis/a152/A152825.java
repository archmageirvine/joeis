package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152825 Decimal expansion of log_21 (2).
 * @author Sean A. Irvine
 */
public class A152825 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152825() {
    super(CR.TWO.log().divide(CR.valueOf(21).log()));
  }
}
