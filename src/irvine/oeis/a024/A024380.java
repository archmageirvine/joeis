package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024380 4th elementary symmetric function of the first <code>n+3</code> positive integers congruent to <code>1 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A024380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024380() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9},
      new long[] {585, 14389, 122119, 633619, 2441334, 7680414, 20836578, 50469738, 111748263});
  }
}
