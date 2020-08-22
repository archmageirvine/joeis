package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287396 a(n) = (7*(csc(2*Pi/7))^2)^n + (7*(csc(4*Pi/7))^2)^n + (7*(csc(8*Pi/7))^2)^n.
 * @author Sean A. Irvine
 */
public class A287396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287396() {
    super(new long[] {3136, -784, 56}, new long[] {3, 56, 1568});
  }
}
