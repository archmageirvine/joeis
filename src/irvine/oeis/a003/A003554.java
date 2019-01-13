package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003554.
 * @author Sean A. Irvine
 */
public class A003554 extends FiniteSequence {

  /** Construct the sequence. */
  public A003554() {
    super(A003529.divisors(50));
  }
}

