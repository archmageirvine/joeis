package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019726 Decimal expansion of sqrt(Pi)/24.
 * @author Sean A. Irvine
 */
public class A019726 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.valueOf(24));

  /** Construct the sequence. */
  public A019726() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
