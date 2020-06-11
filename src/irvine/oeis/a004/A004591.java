package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004591 Expansion of <code>sqrt(10)</code> in base 8.
 * @author Sean A. Irvine
 */
public class A004591 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.sqrt();

  /** Construct the sequence. */
  public A004591() {
    super(false, 8);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
