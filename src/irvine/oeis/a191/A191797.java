package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191797 a(n) = binomial(F(n), 2) where F(n) = A000045(n).
 * @author Sean A. Irvine
 */
public class A191797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191797() {
    super(new long[] {1, -1, -5, 1, 3}, new long[] {0, 0, 0, 1, 3});
  }
}
