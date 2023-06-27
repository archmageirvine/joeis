package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181427 a(n) = n + [n^2 if n is odd or n^3 if n is even].
 * @author Sean A. Irvine
 */
public class A181427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181427() {
    super(1, new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {2, 10, 12, 68, 30, 222, 56, 520});
  }
}
