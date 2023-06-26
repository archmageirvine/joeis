package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036329 Composite numbers n such that juxtaposition of prime factors of n has length 5.
 * @author Sean A. Irvine
 */
public class A036329 extends FiniteSequence {

  /** Construct the sequence. */
  public A036329() {
    super(1, FINITE, A036328.build(5));
  }
}
