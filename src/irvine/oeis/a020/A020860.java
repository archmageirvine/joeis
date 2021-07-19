package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020860 Decimal expansion of log(7)/log(2).
 * @author Sean A. Irvine
 */
public class A020860 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020860() {
    super(CR.SEVEN.log().divide(CR.TWO.log()));
  }
}
