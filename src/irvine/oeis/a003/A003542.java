package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003542.
 * @author Sean A. Irvine
 */
public class A003542 extends FiniteSequence {

  /** Construct the sequence. */
  public A003542() {
    super(A003529.divisors(35));
  }
}

