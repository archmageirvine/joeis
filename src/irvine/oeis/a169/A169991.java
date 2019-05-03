package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169991 Expansion of <code>Prod((1+x^(2*i+1)),i=0..m-1)</code> for <code>m=8</code>.
 * @author Georg Fischer
 */
public class A169991 extends FiniteSequence {

  /** Construct the sequence. */
  public A169991() {
    super(1, 1, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 5, 4, 4, 5, 5, 6, 5, 6, 7, 7, 6, 7, 8, 7, 7, 7, 8, 7, 7, 7, 8, 7, 6, 7, 7, 6, 5, 6, 5, 5, 4, 4, 5, 4, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 1, 1);
  }
}
