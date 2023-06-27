package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168457 a(n) = (10*n + 5*(-1)^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A168457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168457() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 12, 12});
  }
}
