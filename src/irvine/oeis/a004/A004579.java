package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004579 Expansion of sqrt(8) in base 4.
 * @author Sean A. Irvine
 */
public class A004579 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(8).sqrt();

  /** Construct the sequence. */
  public A004579() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
