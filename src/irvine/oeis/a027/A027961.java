package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027961.
 * @author Sean A. Irvine
 */
public class A027961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027961() {
    super(new long[] {-1, 0, 2}, new long[] {1, 4, 8});
  }
}
