package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019714 Decimal expansion of sqrt(Pi)/12.
 * @author Sean A. Irvine
 */
public class A019714 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019714() {
    super(CR.SQRT_PI.divide(CR.valueOf(12)));
  }
}
