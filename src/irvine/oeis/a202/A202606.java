package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202606 a(n) = ceiling(((10^n - 1)^2/9 + 10^n)/18).
 * @author Sean A. Irvine
 */
public class A202606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202606() {
    super(new long[] {1000, -1110, 111}, new long[] {1, 2, 67});
  }
}
