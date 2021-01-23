package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004581 Expansion of sqrt(8) in base 6.
 * @author Sean A. Irvine
 */
public class A004581 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.sqrt();

  /** Construct the sequence. */
  public A004581() {
    super(false, 6);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
