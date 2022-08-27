package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019796 Decimal expansion of sqrt(e)/23.
 * @author Sean A. Irvine
 */
public class A019796 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019796() {
    super(0, CR.E.sqrt().divide(CR.valueOf(23)));
  }
}
