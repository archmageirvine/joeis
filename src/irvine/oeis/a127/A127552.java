package irvine.oeis.a127;

import irvine.oeis.a001.A001359;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A127552 Decimal expansion of the number 3.19644719338616871113868629540207517... having continued fraction expansion 3, 5, 11, 17, 29, 41, 59, 71, 101, 107, ... (lesser of twin primes A001359).
 * @author Sean A. Irvine
 */
public class A127552 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A127552() {
    super(1, new A001359());
  }
}
