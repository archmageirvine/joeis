package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071408.
 * @author Sean A. Irvine
 */
public class A071408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071408() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 4, 7, 10});
  }
}
