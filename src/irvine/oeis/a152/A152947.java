package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152947 a(n) = 1 + (n-2)*(n-1)/2.
 * @author Sean A. Irvine
 */
public class A152947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152947() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 1, 2});
  }
}
