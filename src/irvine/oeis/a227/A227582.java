package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227582.
 * @author Sean A. Irvine
 */
public class A227582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227582() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {2, 7, 14, 23, 35, 50, 67});
  }
}
