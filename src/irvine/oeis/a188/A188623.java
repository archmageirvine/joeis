package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188623.
 * @author Sean A. Irvine
 */
public class A188623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188623() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 2, 2, 5, 7});
  }
}
