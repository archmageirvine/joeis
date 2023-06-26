package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003530 Divisors of 2^21 - 1.
 * @author Sean A. Irvine
 */
public class A003530 extends FiniteSequence {

  /** Construct the sequence. */
  public A003530() {
    super(1, FINITE, A003529.divisors(21));
  }
}

