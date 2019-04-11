package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020522 <code>a(n) = 4^n - 2^n</code>.
 * @author Sean A. Irvine
 */
public class A020522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020522() {
    super(new long[] {-8, 6}, new long[] {0, 2});
  }
}
