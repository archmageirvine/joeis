package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070417 a(n) = 7^n mod 33.
 * @author Sean A. Irvine
 */
public class A070417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070417() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {1, 7, 16, 13, 25, 10, 4, 28, 31});
  }
}
