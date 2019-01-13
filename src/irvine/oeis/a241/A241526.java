package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241526.
 * @author Sean A. Irvine
 */
public class A241526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241526() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {2, 7, 16, 31, 53, 83});
  }
}
