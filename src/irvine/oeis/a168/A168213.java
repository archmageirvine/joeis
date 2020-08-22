package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168213 a(n) = (11 + 18*n + 9*(-1)^n)/4.
 * @author Sean A. Irvine
 */
public class A168213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168213() {
    super(new long[] {-1, 1, 1}, new long[] {5, 14, 14});
  }
}
