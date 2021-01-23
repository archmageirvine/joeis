package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100104 a(n) = n^3 - n^2 + 1.
 * @author Sean A. Irvine
 */
public class A100104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100104() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1, 5, 19});
  }
}
