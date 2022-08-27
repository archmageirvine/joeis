package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019797 Decimal expansion of sqrt(e)/24.
 * @author Sean A. Irvine
 */
public class A019797 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019797() {
    super(0, CR.E.sqrt().divide(CR.valueOf(24)));
  }
}
