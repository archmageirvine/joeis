package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070473 a(n) = n^3 mod 11.
 * @author Sean A. Irvine
 */
public class A070473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070473() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 8, 5, 9, 4, 7, 2, 6, 3, 10});
  }
}
