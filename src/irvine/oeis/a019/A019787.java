package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019787 Decimal expansion of sqrt(e)/14.
 * @author Sean A. Irvine
 */
public class A019787 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019787() {
    super(CR.E.sqrt().divide(CR.valueOf(14)));
  }
}
