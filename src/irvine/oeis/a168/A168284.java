package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168284.
 * @author Sean A. Irvine
 */
public class A168284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168284() {
    super(new long[] {-1, 1, 1}, new long[] {0, 5, 5});
  }
}
