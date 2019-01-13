package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268306.
 * @author Sean A. Irvine
 */
public class A268306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268306() {
    super(new long[] {-1, 0, -1, 2, -1, 2}, new long[] {1, 1, 2, 4, 7, 12});
  }
}
