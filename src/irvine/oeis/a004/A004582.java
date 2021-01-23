package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004582 Expansion of sqrt(8) in base 7.
 * @author Sean A. Irvine
 */
public class A004582 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.sqrt();

  /** Construct the sequence. */
  public A004582() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
