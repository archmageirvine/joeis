package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004574 Expansion of <code>sqrt(7)</code> in base 7.
 * @author Sean A. Irvine
 */
public class A004574 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).sqrt();

  /** Construct the sequence. */
  public A004574() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
