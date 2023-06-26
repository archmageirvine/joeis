package irvine.oeis.a145;

import irvine.oeis.FiniteSequence;

/**
 * A145461 Numbers that can be written with a single digit in base 10 as well as in some base b&lt;10.
 * @author Georg Fischer
 */
public class A145461 extends FiniteSequence {

  /** Construct the sequence. */
  public A145461() {
    super(1, FINITE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 777);
  }
}
