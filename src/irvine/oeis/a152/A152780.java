package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152780 Decimal expansion of log_14 (2).
 * @author Sean A. Irvine
 */
public class A152780 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152780() {
    super(CR.TWO.log().divide(CR.valueOf(14).log()));
  }
}
