package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126977 A <code>3 x 3</code> multiplicative magic square read by rows.
 * @author Georg Fischer
 */
public class A126977 extends FiniteSequence {

  /** Construct the sequence. */
  public A126977() {
    super(2, 9, 12, 36, 6, 1, 3, 4, 18);
  }
}
