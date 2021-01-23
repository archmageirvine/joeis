package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003553 Divisors of 2^48 - 1.
 * @author Sean A. Irvine
 */
public class A003553 extends FiniteSequence {

  /** Construct the sequence. */
  public A003553() {
    super(A003529.divisors(48));
  }
}

