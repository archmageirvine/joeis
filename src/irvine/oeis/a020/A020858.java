package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020858 Decimal expansion of log_2(5).
 * @author Sean A. Irvine
 */
public class A020858 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020858() {
    super(CR.FIVE.log().divide(CR.TWO.log()));
  }
}
