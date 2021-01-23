package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003534 Divisors of 2^26 - 1.
 * @author Sean A. Irvine
 */
public class A003534 extends FiniteSequence {

  /** Construct the sequence. */
  public A003534() {
    super(A003529.divisors(26));
  }
}

