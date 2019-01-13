package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118729.
 * @author Sean A. Irvine
 */
public class A118729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118729() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 2});
  }
}
