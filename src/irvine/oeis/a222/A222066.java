package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222066 Decimal expansion of 1/sqrt(128).
 * @author Sean A. Irvine
 */
public class A222066 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(128).sqrt().inverse();

  /** Construct the sequence. */
  public A222066() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
