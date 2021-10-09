package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019726 Decimal expansion of sqrt(Pi)/24.
 * @author Sean A. Irvine
 */
public class A019726 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019726() {
    super(-1, CR.SQRT_PI.divide(CR.valueOf(24)));
  }
}
