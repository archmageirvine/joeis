package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050488 a(n) = 3*(2^n-1) - 2*n.
 * @author Sean A. Irvine
 */
public class A050488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050488() {
    super(new long[] {2, -5, 4}, new long[] {0, 1, 5});
  }
}
