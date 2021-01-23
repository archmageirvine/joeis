package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004592 Expansion of sqrt(10) in base 9.
 * @author Sean A. Irvine
 */
public class A004592 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.sqrt();

  /** Construct the sequence. */
  public A004592() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
