package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019738 Decimal expansion of sqrt(2*Pi)/23.
 * @author Sean A. Irvine
 */
public class A019738 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019738() {
    super(CR.TAU.sqrt().divide(CR.valueOf(23)));
  }
}
