package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269963.
 * @author Sean A. Irvine
 */
public class A269963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269963() {
    super(new long[] {2, 2, -2, 1, 2}, new long[] {1, 2, 7, 16, 37});
  }
}
