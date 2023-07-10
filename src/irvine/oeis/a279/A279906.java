package irvine.oeis.a279;

import irvine.oeis.a005.A005843;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A279906 Decimal expansion of the number whose continued fraction expansion consists of the even numbers.
 * @author Sean A. Irvine
 */
public class A279906 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A279906() {
    super(1, new A005843().skip());
  }
}
