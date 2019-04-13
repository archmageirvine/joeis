package irvine.oeis.a000;

import irvine.oeis.RatPolyGfSequence;

/**
 * A000964 The convergent sequence C_n for the ternary continued fraction <code>(3,1</code>;2,2) of period 2.
 * @author Sean A. Irvine
 */
public class A000964 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A000964() {
    super(new long[] {0, 0, 1, 1, -3, 1}, new long[] {1, 0, -7, 0, 3, 0, -1});
  }
}
