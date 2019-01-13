package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004568.
 * @author Sean A. Irvine
 */
public class A004568 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).sqrt();

  /** Construct the sequence. */
  public A004568() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
