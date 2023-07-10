package irvine.oeis.a152;

import irvine.oeis.a008.A008578;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A152062 Decimal expansion of number with continued fraction expansion 1, 2, 3, 5, 7, 11, 13, 17, 19, ...
 * @author Sean A. Irvine
 */
public class A152062 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A152062() {
    super(1, new A008578());
  }
}
