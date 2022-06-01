package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100503 Bisection of A000125.
 * @author Sean A. Irvine
 */
public class A100503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100503() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 15, 42});
  }
}
