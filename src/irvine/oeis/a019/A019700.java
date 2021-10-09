package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019700 Decimal expansion of 2*Pi/17.
 * @author Sean A. Irvine
 */
public class A019700 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019700() {
    super(CR.TAU.divide(CR.valueOf(17)));
  }
}
