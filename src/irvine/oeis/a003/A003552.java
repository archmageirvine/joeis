package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003552 Divisors of 2^47 - 1.
 * @author Sean A. Irvine
 */
public class A003552 extends FiniteSequence {

  /** Construct the sequence. */
  public A003552() {
    super(1, FINITE, A003529.divisors(47));
  }
}

