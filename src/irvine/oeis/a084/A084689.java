package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084689 <code>3^n</code> uses only distinct decimal digits.
 * @author Georg Fischer
 */
public class A084689 extends FiniteSequence {

  /** Construct the sequence. */
  public A084689() {
    super(0, 1, 2, 3, 4, 5, 6, 7, 9);
  }
}
