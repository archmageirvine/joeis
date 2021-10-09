package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019724 Decimal expansion of sqrt(Pi)/22.
 * @author Sean A. Irvine
 */
public class A019724 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019724() {
    super(-1, CR.SQRT_PI.divide(CR.valueOf(22)));
  }
}
