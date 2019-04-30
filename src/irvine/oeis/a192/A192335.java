package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192335 Numbers n such that <code>phi(n)</code> divides <code>rad(n)</code>.
 * @author Georg Fischer
 */
public class A192335 extends FiniteSequence {

  /** Construct the sequence. */
  public A192335() {
    super(1, 2, 4, 6, 18);
  }
}
