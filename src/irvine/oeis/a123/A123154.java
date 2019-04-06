package irvine.oeis.a123;

import irvine.oeis.FiniteSequence;

/**
 * A123154 A 3 X 3 magic square read by rows. From a quiz.
 * @author Georg Fischer
 */
public class A123154 extends FiniteSequence {

  /** Construct the sequence. */
  public A123154() {
    super(6, 7, 2, 1, 5, 9, 8, 3, 4);
  }
}
