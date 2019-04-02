package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004587 Expansion of sqrt(10) in base 4.
 * @author Sean A. Irvine
 */
public class A004587 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).sqrt();

  /** Construct the sequence. */
  public A004587() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
