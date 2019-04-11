package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004558 Expansion of <code>sqrt(5)</code> in base 5.
 * @author Sean A. Irvine
 */
public class A004558 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A004558() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
