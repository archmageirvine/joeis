package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169987 Expansion of Product_{i=0..m-1} (1 + x^(2*i+1)) for m=4.
 * @author Georg Fischer
 */
public class A169987 extends FiniteSequence {

  /** Construct the sequence. */
  public A169987() {
    super(1, 1, 0, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 0, 1, 1);
  }
}
