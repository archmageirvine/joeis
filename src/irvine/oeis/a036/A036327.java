package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036327 Composite numbers n such that juxtaposition of prime factors of n has length 3.
 * @author Sean A. Irvine
 */
public class A036327 extends FiniteSequence {

  /** Construct the sequence. */
  public A036327() {
    super(1, FINITE, A036328.build(3));
  }
}
