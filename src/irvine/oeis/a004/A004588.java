package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004588.
 * @author Sean A. Irvine
 */
public class A004588 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).sqrt();

  /** Construct the sequence. */
  public A004588() {
    super(false, 5);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
