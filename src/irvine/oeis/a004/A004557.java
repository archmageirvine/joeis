package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004557 Expansion of sqrt(5) in base 4.
 * @author Sean A. Irvine
 */
public class A004557 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A004557() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
