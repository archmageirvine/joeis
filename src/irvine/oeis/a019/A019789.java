package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019789 Decimal expansion of sqrt(e)/16.
 * @author Sean A. Irvine
 */
public class A019789 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019789() {
    super(CR.E.sqrt().divide(CR.valueOf(16)));
  }
}
