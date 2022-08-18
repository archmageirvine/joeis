package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019758 Decimal expansion of e/21.
 * @author Sean A. Irvine
 */
public class A019758 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019758() {
    super(0, CR.E.divide(CR.valueOf(21)));
  }
}
