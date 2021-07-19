package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152778 Decimal expansion of log_12 (2).
 * @author Sean A. Irvine
 */
public class A152778 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152778() {
    super(CR.TWO.log().divide(CR.valueOf(12).log()));
  }
}
