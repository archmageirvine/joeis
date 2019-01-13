package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287185.
 * @author Sean A. Irvine
 */
public class A287185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287185() {
    super(new long[] {-1, -3, 0, 1, 0, 1, 3, 0}, new long[] {2, 4, 7, 14, 25, 47, 88, 166});
  }
}
