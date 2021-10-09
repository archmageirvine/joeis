package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019715 Decimal expansion of sqrt(Pi)/13.
 * @author Sean A. Irvine
 */
public class A019715 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019715() {
    super(CR.SQRT_PI.divide(CR.valueOf(13)));
  }
}
