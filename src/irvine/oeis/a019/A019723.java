package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019723 Decimal expansion of sqrt(Pi)/21.
 * @author Sean A. Irvine
 */
public class A019723 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019723() {
    super(0, CR.SQRT_PI.divide(CR.valueOf(21)));
  }
}
