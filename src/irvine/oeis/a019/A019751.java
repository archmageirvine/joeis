package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019751 Decimal expansion of e/14.
 * @author Sean A. Irvine
 */
public class A019751 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019751() {
    super(0, CR.E.divide(CR.valueOf(14)));
  }
}
