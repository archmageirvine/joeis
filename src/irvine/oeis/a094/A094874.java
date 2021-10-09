package irvine.oeis.a094;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A094874 Decimal expansion of (5-sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A094874 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A094874() {
    super(CR.FIVE.subtract(CR.FIVE.sqrt()).divide(CR.TWO));
  }
}
