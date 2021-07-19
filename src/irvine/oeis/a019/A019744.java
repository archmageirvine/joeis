package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019744 Decimal expansion of e/7.
 * @author Sean A. Irvine
 */
public class A019744 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019744() {
    super(CR.E.divide(CR.SEVEN));
  }
}
