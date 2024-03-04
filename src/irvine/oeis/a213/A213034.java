package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213034 a(n) = floor(3*n/2)*floor(n/3).
 * @author Sean A. Irvine
 */
public class A213034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213034() {
    super(new long[] {1, -1, 0, -1, 1, 0, -1, 1, 0, 1}, new long[] {0, 0, 0, 4, 6, 7, 18, 21, 24, 40});
  }
}
