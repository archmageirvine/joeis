package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003537 Divisors of 2^29 - 1.
 * @author Sean A. Irvine
 */
public class A003537 extends FiniteSequence {

  /** Construct the sequence. */
  public A003537() {
    super(1, FINITE, A003529.divisors(29));
  }
}

