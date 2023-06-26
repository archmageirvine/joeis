package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003548 Divisors of 2^43 - 1.
 * @author Sean A. Irvine
 */
public class A003548 extends FiniteSequence {

  /** Construct the sequence. */
  public A003548() {
    super(1, FINITE, A003529.divisors(43));
  }
}

