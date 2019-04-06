package irvine.oeis.a170;

import irvine.oeis.FiniteSequence;

/**
 * A170968 Expansion of Prod((1+x^(4*i+1)),i=0..m-1) for m = 5.
 * @author Georg Fischer
 */
public class A170968 extends FiniteSequence {

  /** Construct the sequence. */
  public A170968() {
    super(1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 2, 1, 0, 1, 2, 1, 0, 0, 2, 2, 0, 0, 1, 2, 1, 0, 1, 2, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1);
  }
}
