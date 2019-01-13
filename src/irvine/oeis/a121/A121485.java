package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121485.
 * @author Sean A. Irvine
 */
public class A121485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121485() {
    super(new long[] {1, 0, -4, -2, 4, 1}, new long[] {1, 1, 2, 4, 8, 16});
  }
}
