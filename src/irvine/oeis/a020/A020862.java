package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020862 Decimal expansion of log_2(10).
 * @author Sean A. Irvine
 */
public class A020862 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020862() {
    super(CR.TEN.log().divide(CR.TWO.log()));
  }
}
