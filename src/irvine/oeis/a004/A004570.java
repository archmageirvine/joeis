package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004570 Expansion of sqrt(7) in base 3.
 * @author Sean A. Irvine
 */
public class A004570 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.sqrt();

  /** Construct the sequence. */
  public A004570() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
