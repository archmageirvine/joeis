package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109595.
 * @author Sean A. Irvine
 */
public class A109595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109595() {
    super(new long[] {-1, 0, 0, 4, 0, 0, -6, 0, 0, 4, 0, 0}, new long[] {1, 1, 1, 8, 4, 2, 27, 9, 3, 64, 16, 4});
  }
}
