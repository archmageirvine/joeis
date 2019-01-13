package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279231.
 * @author Sean A. Irvine
 */
public class A279231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279231() {
    super(new long[] {-3, 9, -10, 5}, new long[] {1, 5, 15, 34});
  }
}
