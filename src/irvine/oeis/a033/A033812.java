package irvine.oeis.a033;

import irvine.oeis.FiniteSequence;

/**
 * A033812 The Loh-Shu 3 X 3 magic square, lexicographically largest variant when read by columns.
 * @author Georg Fischer
 */
public class A033812 extends FiniteSequence {

  /** Construct the sequence. */
  public A033812() {
    super(8, 1, 6, 3, 5, 7, 4, 9, 2);
  }
}
