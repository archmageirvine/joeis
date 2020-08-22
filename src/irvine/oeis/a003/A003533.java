package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003533 Divisors of 2^25 - 1.
 * @author Sean A. Irvine
 */
public class A003533 extends FiniteSequence {

  /** Construct the sequence. */
  public A003533() {
    super(A003529.divisors(25));
  }
}

