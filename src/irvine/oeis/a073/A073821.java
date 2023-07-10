package irvine.oeis.a073;

import irvine.oeis.a005.A005843;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A073821 Decimal expansion of number with continued fraction expansion 0, 2, 4, 6, ... (the even numbers).
 * @author Sean A. Irvine
 */
public class A073821 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A073821() {
    super(new A005843());
  }
}
