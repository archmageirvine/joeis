package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084690 4^n uses only distinct decimal digits.
 * @author Georg Fischer
 */
public class A084690 extends FiniteSequence {

  /** Construct the sequence. */
  public A084690() {
    super(0, 1, 2, 3, 4, 5, 6, 7, 10);
  }
}
