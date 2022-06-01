package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109010 a(n) = gcd(n,7).
 * @author Sean A. Irvine
 */
public class A109010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109010() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {7, 1, 1, 1, 1, 1, 1});
  }
}
