package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004578 Expansion of sqrt(8) in base 3.
 * @author Sean A. Irvine
 */
public class A004578 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.sqrt();

  /** Construct the sequence. */
  public A004578() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
