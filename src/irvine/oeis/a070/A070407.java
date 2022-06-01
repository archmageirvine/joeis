package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070407 a(n) = 7^n mod 17.
 * @author Sean A. Irvine
 */
public class A070407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070407() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 7, 15, 3, 4, 11, 9, 12, 16});
  }
}
