package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003547.
 * @author Sean A. Irvine
 */
public class A003547 extends FiniteSequence {

  /** Construct the sequence. */
  public A003547() {
    super(A003529.divisors(42));
  }
}

