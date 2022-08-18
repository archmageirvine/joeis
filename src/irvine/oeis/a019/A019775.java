package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019775 Decimal expansion of sqrt(e)/2.
 * @author Sean A. Irvine
 */
public class A019775 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019775() {
    super(0, CR.E.sqrt().divide(CR.TWO));
  }
}
