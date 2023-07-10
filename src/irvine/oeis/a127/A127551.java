package irvine.oeis.a127;

import irvine.oeis.a000.A000040;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A127551 Decimal expansion of the number 5.1410381418412742236797378119983... having continued fraction expansion 5, 7, 11, 13, 17, 19, ... (successive odd primes starting from 5).
 * @author Sean A. Irvine
 */
public class A127551 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A127551() {
    super(1, new A000040().skip(2));
  }
}
