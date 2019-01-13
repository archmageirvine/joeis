package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225393.
 * @author Sean A. Irvine
 */
public class A225393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225393() {
    super(new long[] {1, 0, -1, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 12, 19});
  }
}
