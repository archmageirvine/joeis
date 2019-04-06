package irvine.oeis.a140;

import irvine.oeis.FiniteSequence;

/**
 * A140411 Conjectured complete list of squarefree numbers that can be written as a sum of at most two positive squares, but not as a sum of three positive squares.
 * @author Georg Fischer
 */
public class A140411 extends FiniteSequence {

  /** Construct the sequence. */
  public A140411() {
    super(1, 2, 5, 10, 13, 37, 58, 85, 130);
  }
}
