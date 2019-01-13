package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129707.
 * @author Sean A. Irvine
 */
public class A129707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129707() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {0, 0, 1, 4, 12, 31});
  }
}
