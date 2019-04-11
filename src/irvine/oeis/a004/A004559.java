package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004559 Expansion of <code>sqrt(5)</code> in base 6.
 * @author Sean A. Irvine
 */
public class A004559 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A004559() {
    super(false, 6);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
