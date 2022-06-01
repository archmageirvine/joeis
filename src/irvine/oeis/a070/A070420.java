package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070420 a(n) = 7^n mod 37.
 * @author Sean A. Irvine
 */
public class A070420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070420() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 12, 10, 33, 9, 26, 34, 16});
  }
}
