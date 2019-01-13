package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181532.
 * @author Sean A. Irvine
 */
public class A181532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181532() {
    super(new long[] {1, 0, 1, 1}, new long[] {0, 1, 1, 2});
  }
}
