package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136211 Denominators in continued fraction <code>[0</code>; <code>1, 3, 1, 3, 1, 3,</code>...].
 * @author Sean A. Irvine
 */
public class A136211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136211() {
    super(new long[] {-1, 0, 5, 0}, new long[] {1, 4, 5, 19});
  }
}
