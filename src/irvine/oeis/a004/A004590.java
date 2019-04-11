package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004590 Expansion of <code>sqrt(10)</code> in base 7.
 * @author Sean A. Irvine
 */
public class A004590 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).sqrt();

  /** Construct the sequence. */
  public A004590() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
