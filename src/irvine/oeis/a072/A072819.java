package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072819 Variance of time for a random walk starting at 0 to reach one of the boundaries at +n or -n for the first time.
 * @author Sean A. Irvine
 */
public class A072819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072819() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 8, 48, 160});
  }
}
