package irvine.oeis.a127;

import irvine.oeis.a000.A000040;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A127550 Decimal expansion of the number 3.19451324273619331289098105345... having continued fraction expansion 3, 5, 7, 11, 13, 17, 19, ... (successive odd primes).
 * @author Sean A. Irvine
 */
public class A127550 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A127550() {
    super(1, new A000040().skip());
  }
}
