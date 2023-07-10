package irvine.oeis.a327;

import irvine.oeis.a124.A124625;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A327555 Decimal expansion of number with continued fraction expansion [1; 2, 1, 4, 1, 6, 1, 8, 1, 10, 1, ...].
 * @author Sean A. Irvine
 */
public class A327555 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A327555() {
    super(1, new A124625().skip(2));
  }
}
