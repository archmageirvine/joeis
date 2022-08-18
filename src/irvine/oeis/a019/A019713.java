package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019713 Decimal expansion of sqrt(Pi)/11.
 * @author Sean A. Irvine
 */
public class A019713 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019713() {
    super(0, CR.SQRT_PI.divide(CR.valueOf(11)));
  }
}
