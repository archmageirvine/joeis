package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153772 a(n) = (2^n + 2*(-1)^n - 6)/3.
 * @author Sean A. Irvine
 */
public class A153772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153772() {
    super(new long[] {-2, 1, 2}, new long[] {-1, -2, 0});
  }
}
