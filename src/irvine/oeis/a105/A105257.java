package irvine.oeis.a105;

import irvine.oeis.FiniteSequence;

/**
 * A105257 Cayley (or multiplication) table of S_3, the symmetric group on three letters, read by rows.
 * @author Georg Fischer
 */
public class A105257 extends FiniteSequence {

  /** Construct the sequence. */
  public A105257() {
    super(1, 2, 3, 4, 5, 6, 2, 1, 4, 3, 6, 5, 3, 6, 5, 2, 1, 4, 4, 5, 6, 1, 2, 3, 5, 4, 1, 6, 3, 2, 6, 3, 2, 5, 4, 1);
  }
}
