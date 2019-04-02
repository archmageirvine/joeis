package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058281 Continued fraction for square root of e.
 * @author Sean A. Irvine
 */
public class A058281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058281() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 1, 1, 1, 5, 1});
  }
}
