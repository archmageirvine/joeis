package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003538 Divisors of 2^30 - 1.
 * @author Sean A. Irvine
 */
public class A003538 extends FiniteSequence {

  /** Construct the sequence. */
  public A003538() {
    super(A003529.divisors(30));
  }
}

