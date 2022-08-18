package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019788 Decimal expansion of sqrt(e)/15.
 * @author Sean A. Irvine
 */
public class A019788 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019788() {
    super(0, CR.E.sqrt().divide(CR.valueOf(15)));
  }
}
