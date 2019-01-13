package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004556.
 * @author Sean A. Irvine
 */
public class A004556 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A004556() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
