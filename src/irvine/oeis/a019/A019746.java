package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019746 Decimal expansion of e/9.
 * @author Sean A. Irvine
 */
public class A019746 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019746() {
    super(0, CR.E.divide(CR.NINE));
  }
}
