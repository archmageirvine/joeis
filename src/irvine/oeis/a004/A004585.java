package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004585 Expansion of <code>sqrt(10)</code> in base 2.
 * @author Sean A. Irvine
 */
public class A004585 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.sqrt();

  /** Construct the sequence. */
  public A004585() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
