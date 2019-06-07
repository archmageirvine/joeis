package irvine.oeis.a098;

import irvine.oeis.FiniteSequence;

/**
 * A098934 Numbers n such that the sum of the first n digits of <code>Pi</code> are divisible by <code>n</code>.
 * @author Georg Fischer
 */
public class A098934 extends FiniteSequence {

  /** Construct the sequence. */
  public A098934() {
    super(1, 2, 9, 11, 16);
  }
}
