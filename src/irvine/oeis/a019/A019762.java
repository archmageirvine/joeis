package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019762 Decimal expansion of 2*e.
 * @author Sean A. Irvine
 */
public class A019762 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019762() {
    super(CR.E.multiply(CR.TWO));
  }
}
