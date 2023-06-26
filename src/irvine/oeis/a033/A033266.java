package irvine.oeis.a033;

import irvine.oeis.FiniteSequence;

/**
 * A033266 Numbers n such that every genus of binary quadratic forms of discriminant -4n consists of a single class and the class number h(-4n) = 2.
 * @author Georg Fischer
 */
public class A033266 extends FiniteSequence {

  /** Construct the sequence. */
  public A033266() {
    super(1, FINITE, 5, 6, 8, 9, 10, 12, 13, 15, 16, 18, 22, 25, 28, 37, 58);
  }
}
