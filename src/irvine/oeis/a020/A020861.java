package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020861 Decimal expansion of log_2(9).
 * @author Sean A. Irvine
 */
public class A020861 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020861() {
    super(CR.NINE.log().divide(CR.TWO.log()));
  }
}
