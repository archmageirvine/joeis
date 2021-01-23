package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004588 Expansion of sqrt(10) in base 5.
 * @author Sean A. Irvine
 */
public class A004588 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.sqrt();

  /** Construct the sequence. */
  public A004588() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
