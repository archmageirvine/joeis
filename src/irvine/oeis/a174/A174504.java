package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174504.
 * @author Sean A. Irvine
 */
public class A174504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174504() {
    super(new long[] {1, 0, 0, -7, 0, 0, 7, 0, 0}, new long[] {1, 1, 5, 1, 13, 33, 1, 81, 197});
  }
}
