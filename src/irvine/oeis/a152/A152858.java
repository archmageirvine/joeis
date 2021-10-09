package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152858 Decimal expansion of log_22 (2).
 * @author Sean A. Irvine
 */
public class A152858 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152858() {
    super(CR.TWO.log().divide(CR.valueOf(22).log()));
  }
}
