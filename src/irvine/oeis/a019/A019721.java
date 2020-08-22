package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019721 Decimal expansion of sqrt(Pi)/19.
 * @author Sean A. Irvine
 */
public class A019721 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.valueOf(19));

  /** Construct the sequence. */
  public A019721() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
