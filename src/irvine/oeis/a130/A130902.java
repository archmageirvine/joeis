package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130902.
 * @author Sean A. Irvine
 */
public class A130902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130902() {
    super(new long[] {2, -1, 0, 2, -1, -4, 0, 1, -2, -1, 3}, new long[] {0, 0, 0, 1, 6, 16, 39, 91, 207, 463, 1014});
  }
}
