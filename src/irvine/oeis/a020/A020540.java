package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020540 a(n) = 8^(n+1) - 2^(n+2).
 * @author Sean A. Irvine
 */
public class A020540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020540() {
    super(new long[] {-16, 10}, new long[] {4, 56});
  }
}
