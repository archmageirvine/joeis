package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003554 Divisors of 2^50 - 1.
 * @author Sean A. Irvine
 */
public class A003554 extends FiniteSequence {

  /** Construct the sequence. */
  public A003554() {
    super(1, FINITE, A003529.divisors(50));
  }
}

