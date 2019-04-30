package irvine.oeis.a170;

import irvine.oeis.FiniteSequence;

/**
 * A170978 Expansion of <code>Prod((1+x^(4*i-1)),i=1</code>..m-1)*(1+x^(2*m-1)) for m <code>= 6</code>.
 * @author Georg Fischer
 */
public class A170978 extends FiniteSequence {

  /** Construct the sequence. */
  public A170978() {
    super(1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 2, 0, 0, 2, 1, 0, 0, 3, 1, 0, 2, 3, 0, 0, 2, 3, 0, 0, 4, 2, 0, 1, 4, 1, 0, 2, 4, 0, 0, 3, 2, 0, 0, 3, 2, 0, 1, 3, 0, 0, 1, 2, 0, 0, 2, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1);
  }
}
