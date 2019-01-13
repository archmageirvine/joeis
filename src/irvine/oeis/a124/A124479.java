package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124479.
 * @author Sean A. Irvine
 */
public class A124479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124479() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 11, 37, 88});
  }
}
