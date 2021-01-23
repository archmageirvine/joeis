package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020537 a(n) = 4*8^n - 3*2^n.
 * @author Sean A. Irvine
 */
public class A020537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020537() {
    super(new long[] {-16, 10}, new long[] {1, 26});
  }
}
