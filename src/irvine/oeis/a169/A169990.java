package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169990 Expansion of Product_{i=0..m-1} (1 + x^(2*i+1)) for m=7.
 * @author Georg Fischer
 */
public class A169990 extends FiniteSequence {

  /** Construct the sequence. */
  public A169990() {
    super(1, 1, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 3, 4, 4, 5, 4, 4, 5, 5, 4, 4, 5, 4, 4, 3, 4, 4, 3, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 1, 1);
  }
}
