package irvine.oeis.a086;

import irvine.oeis.FiniteSequence;

/**
 * A086836 On a <code>3 X 3</code> board, number of distinct positions of n digits <code>(modulo rotation/reflection))</code>.
 * @author Georg Fischer
 */
public class A086836 extends FiniteSequence {

  /** Construct the sequence. */
  public A086836() {
    super(3, 12, 66, 378, 1890, 7560, 22680, 45360, 45360);
  }
}
