package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019725 Decimal expansion of sqrt(Pi)/23.
 * @author Sean A. Irvine
 */
public class A019725 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019725() {
    super(-1, CR.SQRT_PI.divide(CR.valueOf(23)));
  }
}
