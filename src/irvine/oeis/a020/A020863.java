package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020863 Decimal expansion of log_2(11).
 * @author Sean A. Irvine
 */
public class A020863 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020863() {
    super(CR.valueOf(11).log().divide(CR.TWO.log()));
  }
}
