package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003523 Divisors of 2^10 - 1.
 * @author Sean A. Irvine
 */
public class A003523 extends FiniteSequence {

  /** Construct the sequence. */
  public A003523() {
    super(1, FINITE, 1, 3, 11, 31, 33, 93, 341, 1023);
  }
}

