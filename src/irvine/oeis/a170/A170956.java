package irvine.oeis.a170;

import irvine.oeis.FiniteSequence;

/**
 * A170956 Expansion of Product_{i=1..m} (1 + x^(4*i-1)) for m = 3.
 * @author Georg Fischer
 */
public class A170956 extends FiniteSequence {

  /** Construct the sequence. */
  public A170956() {
    super(1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1);
  }
}
