package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055278 Number of rooted trees with n nodes and 3 leaves.
 * @author Sean A. Irvine
 */
public class A055278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055278() {
    super(new long[] {1, -3, 2, 1, 0, -1, -2, 3}, new long[] {1, 3, 8, 18, 35, 62, 103, 161});
  }
}
