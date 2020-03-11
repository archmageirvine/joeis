package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019724 Decimal expansion of <code>sqrt(Pi)/22</code>.
 * @author Sean A. Irvine
 */
public class A019724 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.valueOf(22));

  /** Construct the sequence. */
  public A019724() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
