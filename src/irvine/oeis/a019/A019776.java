package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019776 Decimal expansion of sqrt(e)/3.
 * @author Sean A. Irvine
 */
public class A019776 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019776() {
    super(0, CR.E.sqrt().divide(CR.THREE));
  }
}
