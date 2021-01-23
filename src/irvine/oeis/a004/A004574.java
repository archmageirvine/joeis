package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004574 Expansion of sqrt(7) in base 7.
 * @author Sean A. Irvine
 */
public class A004574 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.sqrt();

  /** Construct the sequence. */
  public A004574() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
