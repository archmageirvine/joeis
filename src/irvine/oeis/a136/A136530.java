package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136530.
 * @author Sean A. Irvine
 */
public class A136530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136530() {
    super(new long[] {8, -12, 6}, new long[] {1, 6, 23});
  }
}
