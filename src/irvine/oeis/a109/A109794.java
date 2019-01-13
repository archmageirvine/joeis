package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109794.
 * @author Sean A. Irvine
 */
public class A109794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109794() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 1, 3, 4});
  }
}
