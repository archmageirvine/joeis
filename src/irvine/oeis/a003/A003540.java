package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003540.
 * @author Sean A. Irvine
 */
public class A003540 extends FiniteSequence {

  /** Construct the sequence. */
  public A003540() {
    super(A003529.divisors(33));
  }
}

