package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004589 Expansion of sqrt(10) in base 6.
 * @author Sean A. Irvine
 */
public class A004589 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.sqrt();

  /** Construct the sequence. */
  public A004589() {
    super(false, 6);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
