package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036330 Composite numbers n such that juxtaposition of prime factors of n has length 6.
 * @author Sean A. Irvine
 */
public class A036330 extends FiniteSequence {

  /** Construct the sequence. */
  public A036330() {
    super(A036328.build(6));
  }
}
