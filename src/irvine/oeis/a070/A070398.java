package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070398 a(n) = 6^n mod 29.
 * @author Sean A. Irvine
 */
public class A070398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070398() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 1}, new long[] {1, 6, 7, 13, 20, 4, 24, 28});
  }
}
