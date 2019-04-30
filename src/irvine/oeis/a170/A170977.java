package irvine.oeis.a170;

import irvine.oeis.FiniteSequence;

/**
 * A170977 Expansion of <code>Prod((1+x^(4*i-1)),i=1</code>..m-1)*(1+x^(2*m-1)) for m <code>= 5</code>.
 * @author Georg Fischer
 */
public class A170977 extends FiniteSequence {

  /** Construct the sequence. */
  public A170977() {
    super(1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1);
  }
}
