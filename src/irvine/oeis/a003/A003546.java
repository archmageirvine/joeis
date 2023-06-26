package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003546 Divisors of 2^40 - 1.
 * @author Sean A. Irvine
 */
public class A003546 extends FiniteSequence {

  /** Construct the sequence. */
  public A003546() {
    super(1, FINITE, A003529.divisors(40));
  }
}

