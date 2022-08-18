package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152901 Decimal expansion of log_24 (2).
 * @author Sean A. Irvine
 */
public class A152901 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152901() {
    super(0, CR.TWO.log().divide(CR.valueOf(24).log()));
  }
}
