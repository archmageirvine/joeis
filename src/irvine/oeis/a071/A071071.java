package irvine.oeis.a071;

import irvine.oeis.FiniteSequence;

/**
 * A071071 Minimal "powers of <code>2"</code> set in base <code>10</code>: any power of 2 contains at least one term of this sequence in its decimal expansion.
 * @author Georg Fischer
 */
public class A071071 extends FiniteSequence {

  /** Construct the sequence. */
  public A071071() {
    super(1, 2, 4, 8, 65536);
  }
}
