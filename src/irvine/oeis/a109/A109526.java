package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109526.
 * @author Sean A. Irvine
 */
public class A109526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109526() {
    super(new long[] {-1, 0, 0, -1, 2, 0, 0, 1}, new long[] {0, 2, 2, 4, 2, 4, 5, 8});
  }
}
