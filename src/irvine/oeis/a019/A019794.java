package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019794 Decimal expansion of sqrt(e)/21.
 * @author Sean A. Irvine
 */
public class A019794 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019794() {
    super(0, CR.E.sqrt().divide(CR.valueOf(21)));
  }
}
