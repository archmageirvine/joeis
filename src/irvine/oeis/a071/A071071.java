package irvine.oeis.a071;

import irvine.oeis.FiniteSequence;

/**
 * A071071 Minimal "powers of <code>2"</code> set in base 10.
 * @author Georg Fischer
 */
public class A071071 extends FiniteSequence {

  /** Construct the sequence. */
  public A071071() {
    super(1, 2, 4, 8, 65536);
  }
}
