package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152675 Decimal expansion of log_5 (2).
 * @author Sean A. Irvine
 */
public class A152675 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152675() {
    super(0, CR.TWO.log().divide(CR.FIVE.log()));
  }
}
