package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004578.
 * @author Sean A. Irvine
 */
public class A004578 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(8).sqrt();

  /** Construct the sequence. */
  public A004578() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
