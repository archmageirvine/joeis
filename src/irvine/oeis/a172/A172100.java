package irvine.oeis.a172;

import irvine.oeis.FiniteSequence;

/**
 * A172100 Diagonal of the <code>26 X 26</code> Caesar Shift table.
 * @author Georg Fischer
 */
public class A172100 extends FiniteSequence {

  /** Construct the sequence. */
  public A172100() {
    super(3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 1);
  }
}
