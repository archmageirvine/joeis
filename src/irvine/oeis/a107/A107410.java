package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107410 Each term is sum of three previous terms <code>mod 9</code>.
 * @author Sean A. Irvine
 */
public class A107410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107410() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 6, 2, 2, 1, 5, 8, 5, 0, 4, 0, 4, 8, 3, 6, 8, 8, 4, 2, 5, 2, 0, 7, 0, 7, 5, 3, 6, 5, 5, 7, 8, 2, 8, 0, 1});
  }
}
