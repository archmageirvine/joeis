package irvine.oeis.a170;

import irvine.oeis.FiniteSequence;

/**
 * A170979 Expansion of (Product_{i=1..m-1} (1 + x^(4*i-1))) * (1 + x^(2*m-1)) for m = 7.
 * @author Georg Fischer
 */
public class A170979 extends FiniteSequence {

  /** Construct the sequence. */
  public A170979() {
    super(1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 2, 1, 1, 1, 2, 2, 1, 1, 3, 1, 1, 2, 2, 2, 1, 3, 3, 2, 2, 3, 2, 3, 1, 3, 3, 2, 2, 3, 3, 2, 2, 3, 3, 1, 3, 2, 3, 2, 2, 3, 3, 1, 2, 2, 2, 1, 1, 3, 1, 1, 2, 2, 1, 1, 1, 2, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1);
  }
}
