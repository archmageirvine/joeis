package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004580 Expansion of <code>sqrt(8)</code> in base 5.
 * @author Sean A. Irvine
 */
public class A004580 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.sqrt();

  /** Construct the sequence. */
  public A004580() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
