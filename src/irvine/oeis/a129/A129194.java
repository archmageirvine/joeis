package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129194 a(n) = n^2*(3/4 - (-1)^n/4).
 * @author Sean A. Irvine
 */
public class A129194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129194() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 2, 9, 8, 25});
  }
}
