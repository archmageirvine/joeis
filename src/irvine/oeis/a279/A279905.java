package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279905 Number of 2 X 2 matrices with entries in <code>{0,1,...,n}</code> and odd trace with no elements repeated.
 * @author Sean A. Irvine
 */
public class A279905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279905() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 0, 16, 72, 216, 480, 960});
  }
}
