package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118646.
 * @author Sean A. Irvine
 */
public class A118646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118646() {
    super(new long[] {2, -1, -2, 1, -2, -1, 3}, new long[] {0, 0, 1, 5, 13, 31, 71});
  }
}
