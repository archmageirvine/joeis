package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090491.
 * @author Sean A. Irvine
 */
public class A090491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090491() {
    super(new long[] {1, -2, 0, 1, 0, 2, -2, 0, -1, 0, 2}, new long[] {1, 1, 3, 5, 10, 15, 26, 37, 57, 79, 112});
  }
}
