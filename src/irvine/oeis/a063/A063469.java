package irvine.oeis.a063;

import irvine.oeis.FiniteSequence;

/**
 * A063469 Numbers n such that <code>tau(n)*3 = phi(n)</code>.
 * @author Georg Fischer
 */
public class A063469 extends FiniteSequence {

  /** Construct the sequence. */
  public A063469() {
    super(7, 21, 26, 56, 70, 78, 108, 126, 168, 210);
  }
}
