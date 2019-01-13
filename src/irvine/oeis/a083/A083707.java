package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083707.
 * @author Sean A. Irvine
 */
public class A083707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083707() {
    super(new long[] {1, -2, -1, 3, 1, -1, -3, 1, 2}, new long[] {0, 1, 2, 9, 17, 37, 63, 108, 165});
  }
}
