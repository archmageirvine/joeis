package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019728 Decimal expansion of sqrt(2*Pi)/3.
 * @author Sean A. Irvine
 */
public class A019728 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019728() {
    super(0, CR.TAU.sqrt().divide(CR.THREE));
  }
}
