package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019718 Decimal expansion of sqrt(Pi)/16.
 * @author Sean A. Irvine
 */
public class A019718 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019718() {
    super(CR.SQRT_PI.divide(CR.valueOf(16)));
  }
}
