package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181532 a(0) = 0, a(1) = 1, a(2) = 1; a(n) = a(n-1) + a(n-2) + a(n-4).
 * @author Sean A. Irvine
 */
public class A181532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181532() {
    super(new long[] {1, 0, 1, 1}, new long[] {0, 1, 1, 2});
  }
}
