package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212564.
 * @author Sean A. Irvine
 */
public class A212564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212564() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 0, 3, 16, 48, 114});
  }
}
