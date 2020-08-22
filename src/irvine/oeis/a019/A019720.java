package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019720 Decimal expansion of sqrt(Pi)/18.
 * @author Sean A. Irvine
 */
public class A019720 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.valueOf(18));

  /** Construct the sequence. */
  public A019720() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
