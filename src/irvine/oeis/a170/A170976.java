package irvine.oeis.a170;

import irvine.oeis.FiniteSequence;

/**
 * A170976 Expansion of Prod((1+x^(4*i-1)),i=1..m-1)*(1+x^(2*m-1)) for m <code>= 4</code>.
 * @author Georg Fischer
 */
public class A170976 extends FiniteSequence {

  /** Construct the sequence. */
  public A170976() {
    super(1, 0, 0, 1, 0, 0, 0, 2, 0, 0, 2, 1, 0, 0, 2, 0, 0, 1, 2, 0, 0, 2, 0, 0, 0, 1, 0, 0, 1);
  }
}
