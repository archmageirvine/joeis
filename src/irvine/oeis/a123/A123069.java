package irvine.oeis.a123;

import irvine.oeis.FiniteSequence;

/**
 * A123069 Odd positive integers that are not the sum of four positive squares.
 * @author Georg Fischer
 */
public class A123069 extends FiniteSequence {

  /** Construct the sequence. */
  public A123069() {
    super(1, 3, 5, 9, 11, 17, 29, 41);
  }
}
