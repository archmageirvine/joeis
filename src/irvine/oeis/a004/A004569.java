package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004569 Expansion of <code>sqrt(7)</code> in base 2.
 * @author Sean A. Irvine
 */
public class A004569 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.sqrt();

  /** Construct the sequence. */
  public A004569() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
