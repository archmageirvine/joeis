package irvine.oeis.a231;

import irvine.oeis.FiniteSequence;

/**
 * A231116 Numbers k such that the total number of digits of all the divisors of k written in base 2 is equal to k.
 * @author Georg Fischer
 */
public class A231116 extends FiniteSequence {

  /** Construct the sequence. */
  public A231116() {
    super(1, FINITE, 1, 3, 10, 24);
  }
}
