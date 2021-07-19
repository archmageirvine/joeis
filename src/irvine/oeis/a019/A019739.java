package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019739 Decimal expansion of e/2.
 * @author Sean A. Irvine
 */
public class A019739 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019739() {
    super(CR.E.divide(CR.TWO));
  }
}
