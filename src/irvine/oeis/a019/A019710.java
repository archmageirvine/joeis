package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019710 Decimal expansion of sqrt(Pi)/8.
 * @author Sean A. Irvine
 */
public class A019710 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019710() {
    super(CR.SQRT_PI.divide(CR.EIGHT));
  }
}
