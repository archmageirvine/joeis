package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169927 Integer values of <code>3*n-45+360/(n/2+8)</code> (see A169926).
 * @author Georg Fischer
 */
public class A169927 extends FiniteSequence {

  /** Construct the sequence. */
  public A169927() {
    super(0, 1, 3, 9, 21, 35, 45, 58, 66, 99, 133, 156, 185, 273, 344, 451, 630, 989, 2068);
  }
}
