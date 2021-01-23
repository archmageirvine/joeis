package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004610 Expansion of sqrt(6) in base 3.
 * @author Sean A. Irvine
 */
public class A004610 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.sqrt();

  /** Construct the sequence. */
  public A004610() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
