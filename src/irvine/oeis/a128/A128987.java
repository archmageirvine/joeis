package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128987 a(n) = (n^3 - n^2)*4^n.
 * @author Sean A. Irvine
 */
public class A128987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128987() {
    super(1, new long[] {-256, 256, -96, 16}, new long[] {0, 64, 1152, 12288});
  }
}
