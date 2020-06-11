package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004575 Expansion of <code>sqrt(7)</code> in base 8.
 * @author Sean A. Irvine
 */
public class A004575 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.sqrt();

  /** Construct the sequence. */
  public A004575() {
    super(false, 8);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
