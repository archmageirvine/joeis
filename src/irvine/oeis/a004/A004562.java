package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004562.
 * @author Sean A. Irvine
 */
public class A004562 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A004562() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
