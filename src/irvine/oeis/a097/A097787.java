package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097787.
 * @author Sean A. Irvine
 */
public class A097787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097787() {
    super(new long[] {-3, 16, -35, 40, -25, 8}, new long[] {1, 8, 39, 152, 526, 1704});
  }
}
