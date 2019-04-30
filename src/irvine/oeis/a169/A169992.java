package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169992 Expansion of <code>Prod((1+x^(2*i+1)),i=0</code>..m-1) for m=9.
 * @author Georg Fischer
 */
public class A169992 extends FiniteSequence {

  /** Construct the sequence. */
  public A169992() {
    super(1, 1, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 7, 6, 7, 8, 9, 8, 9, 10, 10, 10, 10, 12, 12, 11, 11, 13, 12, 12, 12, 13, 13, 12, 12, 12, 13, 11, 11, 12, 12, 10, 10, 10, 10, 9, 8, 9, 8, 7, 6, 7, 6, 5, 5, 5, 5, 4, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 1, 1);
  }
}
