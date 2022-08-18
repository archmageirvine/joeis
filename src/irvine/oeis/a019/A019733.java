package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019733 Decimal expansion of sqrt(2*Pi)/13.
 * @author Sean A. Irvine
 */
public class A019733 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019733() {
    super(0, CR.TAU.sqrt().divide(CR.valueOf(13)));
  }
}
