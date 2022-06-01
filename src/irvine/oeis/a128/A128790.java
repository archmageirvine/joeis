package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128790 n^3*4^n.
 * @author Sean A. Irvine
 */
public class A128790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128790() {
    super(new long[] {-256, 256, -96, 16}, new long[] {0, 4, 128, 1728});
  }
}
