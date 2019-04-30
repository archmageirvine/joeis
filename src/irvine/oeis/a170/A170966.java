package irvine.oeis.a170;

import irvine.oeis.FiniteSequence;

/**
 * A170966 Expansion of <code>Prod((1+x^(4*i+1)),i=0</code>..m-1) for m <code>= 3</code>.
 * @author Georg Fischer
 */
public class A170966 extends FiniteSequence {

  /** Construct the sequence. */
  public A170966() {
    super(1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1);
  }
}
