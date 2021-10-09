package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019727 Decimal expansion of sqrt(2*Pi).
 * @author Sean A. Irvine
 */
public class A019727 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019727() {
    super(CR.TAU.sqrt());
  }
}
