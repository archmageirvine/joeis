package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004561 Expansion of <code>sqrt(5)</code> in base 8.
 * @author Sean A. Irvine
 */
public class A004561 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A004561() {
    super(false, 8);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
