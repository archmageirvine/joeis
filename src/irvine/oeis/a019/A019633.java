package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019633 Decimal expansion of sqrt(2*Pi*e).
 * @author Sean A. Irvine
 */
public class A019633 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019633() {
    super(CR.TAU.multiply(CR.E).sqrt());
  }
}
