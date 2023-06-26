package irvine.oeis.a122;

import irvine.oeis.FiniteSequence;

/**
 * A122064 Subtract 3, take the square root, subtract 3, take the square root, etc.
 * @author Georg Fischer
 */
public class A122064 extends FiniteSequence {

  /** Construct the sequence. */
  public A122064() {
    super(1, FINITE, 147, 144, 12, 9, 3, 0, 0);
  }
}
