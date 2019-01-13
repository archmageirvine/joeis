package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189976.
 * @author Sean A. Irvine
 */
public class A189976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189976() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {1, 1, 5, 5, 15, 15, 35, 35, 70});
  }
}
