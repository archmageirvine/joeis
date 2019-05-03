package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020488 Numbers n such that <code>tau(n)</code> (or <code>sigma_0(n)) = phi(n)</code>.
 * @author Georg Fischer
 */
public class A020488 extends FiniteSequence {

  /** Construct the sequence. */
  public A020488() {
    super(1, 3, 8, 10, 18, 24, 30);
  }
}
