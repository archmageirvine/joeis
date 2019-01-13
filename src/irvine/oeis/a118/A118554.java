package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118554.
 * @author Sean A. Irvine
 */
public class A118554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118554() {
    super(new long[] {1, -1, 0, 0, 0, -6, 6, 0, 0, 0, 1}, new long[] {0, 11, 35, 56, 104, 147, 204, 336, 455, 731, 980});
  }
}
