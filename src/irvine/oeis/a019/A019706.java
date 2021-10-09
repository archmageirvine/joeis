package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019706 Decimal expansion of sqrt(Pi)/4.
 * @author Sean A. Irvine
 */
public class A019706 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019706() {
    super(CR.SQRT_PI.divide(CR.FOUR));
  }
}
