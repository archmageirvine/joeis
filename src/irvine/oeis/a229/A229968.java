package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229968 Numbers not divisible by 3 or 11.
 * @author Sean A. Irvine
 */
public class A229968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229968() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 5, 7, 8, 10, 13, 14, 16, 17, 19, 20, 23, 25, 26, 28, 29, 31, 32, 34});
  }
}
