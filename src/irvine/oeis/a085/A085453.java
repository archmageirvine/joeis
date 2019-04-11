package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085453 Numbers n such that <code>n^2</code> and <code>n^3</code> together use only distinct digits.
 * @author Georg Fischer
 */
public class A085453 extends FiniteSequence {

  /** Construct the sequence. */
  public A085453() {
    super(2, 3, 8, 9, 24, 69);
  }
}
