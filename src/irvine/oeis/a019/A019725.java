package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019725 Decimal expansion of sqrt(Pi)/23.
 * @author Sean A. Irvine
 */
public class A019725 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.valueOf(23));

  /** Construct the sequence. */
  public A019725() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
