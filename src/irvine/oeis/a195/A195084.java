package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195084.
 * @author Sean A. Irvine
 */
public class A195084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195084() {
    super(new long[] {1, 1, -1}, new long[] {1, 3, 0});
  }
}
