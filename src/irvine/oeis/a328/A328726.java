package irvine.oeis.a328;

import irvine.oeis.a002.A002808;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A328726 Decimal expansion of the number with continued fraction expansion 4, 6, 8, 9, 10, 12, 14, 15, ... (A002808 = composite numbers).
 * @author Sean A. Irvine
 */
public class A328726 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A328726() {
    super(1, new A002808());
  }
}
