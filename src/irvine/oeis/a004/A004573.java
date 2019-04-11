package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004573 Expansion of <code>sqrt(7)</code> in base 6.
 * @author Sean A. Irvine
 */
public class A004573 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).sqrt();

  /** Construct the sequence. */
  public A004573() {
    super(false, 6);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
