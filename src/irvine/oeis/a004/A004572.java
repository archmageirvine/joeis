package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004572 Expansion of sqrt(7) in base 5.
 * @author Sean A. Irvine
 */
public class A004572 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.sqrt();

  /** Construct the sequence. */
  public A004572() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
