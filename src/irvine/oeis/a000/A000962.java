package irvine.oeis.a000;

import irvine.oeis.RatPolyGfSequence;

/**
 * A000962 The convergent sequence <code>A_n</code> for the ternary continued fraction <code>(3,1;2,2)</code> of period 2.
 * @author Sean A. Irvine
 */
public class A000962 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A000962() {
    super(new long[] {1, 0, -7, 1, 5, -2}, new long[] {1, 0, -7, 0, 3, 0, -1});
  }
}
