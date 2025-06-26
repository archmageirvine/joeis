package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073457 Numbers k such that phi(k) = pi(k) + 2.
 * @author Georg Fischer
 */
public class A073457 extends FiniteSequence {

  /** Construct the sequence. */
  public A073457() {
    super(1, FINITE, 7, 9, 15, 16, 22, 54, 66, 120, 210);
  }
}
