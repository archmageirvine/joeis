package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003550 Divisors of 2^45 - 1.
 * @author Sean A. Irvine
 */
public class A003550 extends FiniteSequence {

  /** Construct the sequence. */
  public A003550() {
    super(A003529.divisors(45));
  }
}

