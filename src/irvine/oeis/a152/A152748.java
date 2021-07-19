package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152748 Decimal expansion of log_11 (2).
 * @author Sean A. Irvine
 */
public class A152748 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152748() {
    super(CR.TWO.log().divide(CR.valueOf(11).log()));
  }
}
