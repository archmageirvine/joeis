package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120415.
 * @author Sean A. Irvine
 */
public class A120415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120415() {
    super(new long[] {1, 0, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 4});
  }
}
