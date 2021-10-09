package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152713 Decimal expansion of log_7(2).
 * @author Sean A. Irvine
 */
public class A152713 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152713() {
    super(CR.TWO.log().divide(CR.SEVEN.log()));
  }
}
