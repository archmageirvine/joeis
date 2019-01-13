package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118337.
 * @author Sean A. Irvine
 */
public class A118337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118337() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 12, 33, 69, 133, 252, 460});
  }
}
