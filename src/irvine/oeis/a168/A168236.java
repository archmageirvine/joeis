package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168236 a(n) = (6*n - 3*(-1)^n - 1)/4.
 * @author Sean A. Irvine
 */
public class A168236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168236() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 2, 5});
  }
}
