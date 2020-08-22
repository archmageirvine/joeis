package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004571 Expansion of sqrt(7) in base 4.
 * @author Sean A. Irvine
 */
public class A004571 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.sqrt();

  /** Construct the sequence. */
  public A004571() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
