package irvine.oeis.a197;

import irvine.oeis.LinearRecurrence;

/**
 * A197424.
 * @author Sean A. Irvine
 */
public class A197424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197424() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {4, 36, 225, 1600, 10816});
  }
}
