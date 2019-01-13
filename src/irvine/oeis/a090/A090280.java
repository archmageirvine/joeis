package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090280.
 * @author Sean A. Irvine
 */
public class A090280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090280() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {4, 3, 3, 1, 1, 2, 2, 4, 2, 4, 4, 1, 1, 3, 3, 2, 3, 2, 2, 1, 1, 4, 4});
  }
}
