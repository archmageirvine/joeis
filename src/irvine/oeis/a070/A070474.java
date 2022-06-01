package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070474 a(n) = n^3 mod 12, n^5 mod 12.
 * @author Sean A. Irvine
 */
public class A070474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070474() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 8, 3, 4, 5, 0, 7, 8, 9, 4, 11});
  }
}
