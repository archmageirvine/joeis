package irvine.oeis.a170;

import irvine.oeis.FiniteSequence;

/**
 * A170956 Expansion of Prod((1+x^(4*i-1)),i=1..m) for m <code>= 3</code>.
 * @author Georg Fischer
 */
public class A170956 extends FiniteSequence {

  /** Construct the sequence. */
  public A170956() {
    super(1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1);
  }
}
