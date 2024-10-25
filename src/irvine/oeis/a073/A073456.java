package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073456 Numbers n such that phi(n) = pi(n)+1.
 * @author Georg Fischer
 */
public class A073456 extends FiniteSequence {

  /** Construct the sequence. */
  public A073456() {
    super(1, FINITE, 1, 5, 36, 48, 84);
  }
}
