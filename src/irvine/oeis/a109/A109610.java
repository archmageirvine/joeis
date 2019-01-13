package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109610.
 * @author Sean A. Irvine
 */
public class A109610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109610() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 4, 4, 4, 2, 2, 2, 3, 3, 3});
  }
}
