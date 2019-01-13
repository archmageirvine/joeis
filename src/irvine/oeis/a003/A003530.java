package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003530.
 * @author Sean A. Irvine
 */
public class A003530 extends FiniteSequence {

  /** Construct the sequence. */
  public A003530() {
    super(A003529.divisors(21));
  }
}

