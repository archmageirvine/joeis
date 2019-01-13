package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091973.
 * @author Sean A. Irvine
 */
public class A091973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091973() {
    super(new long[] {1, -1, 1, -2, 1, -1, 1, -1, 1, -1, 2, -1, 1}, new long[] {1, 0, 1, 3, 3, 4, 7, 8, 9, 12, 14, 17, 20});
  }
}
