package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169923 Integer values of <code>3*n-36+360/(n+10)</code> (see A169922).
 * @author Georg Fischer
 */
public class A169923 extends FiniteSequence {

  /** Construct the sequence. */
  public A169923() {
    super(0, 0, 3, 8, 12, 21, 36, 52, 63, 77, 120, 155, 208, 297, 476, 1015);
  }
}
