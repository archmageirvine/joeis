package irvine.oeis.a231;

import irvine.oeis.FiniteSequence;

/**
 * A231116 Numbers n such that the total number of digits of all the divisors of n written in base 2 is equal to n.
 * @author Georg Fischer
 */
public class A231116 extends FiniteSequence {

  /** Construct the sequence. */
  public A231116() {
    super(1, 3, 10, 24);
  }
}
