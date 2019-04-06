package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162818 Strictly positive numbers n such that (42*n)/(42+n) is an integer.
 * @author Georg Fischer
 */
public class A162818 extends FiniteSequence {

  /** Construct the sequence. */
  public A162818() {
    super(7, 21, 42, 56, 84, 105, 154, 210, 252, 399, 546, 840, 1722);
  }
}
