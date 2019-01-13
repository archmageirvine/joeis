package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245031.
 * @author Sean A. Irvine
 */
public class A245031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245031() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {0, 1, 21, 120, 2080});
  }
}
