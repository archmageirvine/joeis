package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004566 Expansion of <code>sqrt(6)</code> in base 7.
 * @author Sean A. Irvine
 */
public class A004566 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).sqrt();

  /** Construct the sequence. */
  public A004566() {
    super(false, 7);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
