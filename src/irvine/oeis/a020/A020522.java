package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020522 a(n) = 4^n - 2^n.
 * @author Sean A. Irvine
 */
public class A020522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020522() {
    super(new long[] {-8, 6}, new long[] {0, 2});
  }
}
