package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168301 a(n) = (6*n + 3*(-1)^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A168301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168301() {
    super(new long[] {-1, 1, 1}, new long[] {1, 7, 7});
  }
}
