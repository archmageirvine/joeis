package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004584.
 * @author Sean A. Irvine
 */
public class A004584 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(8).sqrt();

  /** Construct the sequence. */
  public A004584() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
