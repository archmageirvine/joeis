package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279169.
 * @author Sean A. Irvine
 */
public class A279169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279169() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 0, 3, 7, 12, 20, 28});
  }
}
