package irvine.oeis.a214;

import irvine.oeis.a000.A000079;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A214070 Decimal expansion of the number whose continued fraction is 1, 2, 4, 8, 16, ...
 * @author Sean A. Irvine
 */
public class A214070 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A214070() {
    super(1, new A000079());
  }
}
