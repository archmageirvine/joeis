package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004555 Expansion of <code>sqrt(5)</code> in base 2.
 * @author Sean A. Irvine
 */
public class A004555 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.sqrt();

  /** Construct the sequence. */
  public A004555() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
