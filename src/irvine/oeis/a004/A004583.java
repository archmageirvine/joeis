package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004583 Expansion of sqrt(8) in base 8.
 * @author Sean A. Irvine
 */
public class A004583 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.sqrt();

  /** Construct the sequence. */
  public A004583() {
    super(false, 8);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
