package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279101.
 * @author Sean A. Irvine
 */
public class A279101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279101() {
    super(new long[] {1, 1, -4, 0, 3}, new long[] {1, 4, 10, 25, 59});
  }
}
