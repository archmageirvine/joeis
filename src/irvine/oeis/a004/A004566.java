package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004566 Expansion of sqrt(6) in base 7.
 * @author Sean A. Irvine
 */
public class A004566 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.sqrt();

  /** Construct the sequence. */
  public A004566() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
