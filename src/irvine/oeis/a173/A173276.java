package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173276 a(n) = a(n-2) + a(n-3) - floor(a(n-3)/2) - floor(a(n-4)/2).
 * @author Sean A. Irvine
 */
public class A173276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173276() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 2, 2, 3});
  }
}
