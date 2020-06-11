package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004584 Expansion of <code>sqrt(8)</code> in base 9.
 * @author Sean A. Irvine
 */
public class A004584 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.sqrt();

  /** Construct the sequence. */
  public A004584() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
