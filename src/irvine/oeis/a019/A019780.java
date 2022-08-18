package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019780 Decimal expansion of sqrt(e)/7.
 * @author Sean A. Irvine
 */
public class A019780 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019780() {
    super(0, CR.E.sqrt().divide(CR.SEVEN));
  }
}
