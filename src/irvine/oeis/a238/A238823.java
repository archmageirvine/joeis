package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238823.
 * @author Sean A. Irvine
 */
public class A238823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238823() {
    super(new long[] {-1, 3, 1, 1, -4, 0, 3}, new long[] {2, 3, 6, 14, 34, 84, 208});
  }
}
