package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019779 Decimal expansion of sqrt(e)/6.
 * @author Sean A. Irvine
 */
public class A019779 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019779() {
    super(CR.E.sqrt().divide(CR.SIX));
  }
}
