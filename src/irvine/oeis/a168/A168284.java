package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168284 a(n) = (10*n + 5*(-1)^n - 5)/4.
 * @author Sean A. Irvine
 */
public class A168284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168284() {
    super(new long[] {-1, 1, 1}, new long[] {0, 5, 5});
  }
}
