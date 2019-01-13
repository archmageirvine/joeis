package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109815.
 * @author Sean A. Irvine
 */
public class A109815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109815() {
    super(new long[] {-1, 0, 0, 4, 0, 0, -6, 0, 0, 4, 0, 0}, new long[] {1, 1, 1, 4, 8, 2, 9, 27, 3, 16, 64, 4});
  }
}
