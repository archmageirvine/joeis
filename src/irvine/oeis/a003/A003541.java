package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003541 Divisors of 2^34 - 1.
 * @author Sean A. Irvine
 */
public class A003541 extends FiniteSequence {

  /** Construct the sequence. */
  public A003541() {
    super(A003529.divisors(34));
  }
}

