package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133037 a(n) = A000931(n)^2.
 * @author Sean A. Irvine
 */
public class A133037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133037() {
    super(new long[] {-1, 1, -1, 1, 1, 1}, new long[] {1, 0, 0, 1, 0, 1});
  }
}
