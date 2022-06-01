package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105844 Numbers n such that 37*n^2 + 37*n + 1 is a square.
 * @author Sean A. Irvine
 */
public class A105844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105844() {
    super(new long[] {1, -1, -146, 146, 1}, new long[] {0, 24, 48, 3576, 7080});
  }
}
