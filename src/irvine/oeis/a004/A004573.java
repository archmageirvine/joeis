package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004573 Expansion of sqrt(7) in base 6.
 * @author Sean A. Irvine
 */
public class A004573 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.sqrt();

  /** Construct the sequence. */
  public A004573() {
    super(false, 6);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
