package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004560.
 * @author Sean A. Irvine
 */
public class A004560 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A004560() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
