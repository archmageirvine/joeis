package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084173 a(n) = 3*a(n-1) - a(n-2) - 3*a(n-3) + 2*a(n-4).
 * @author Sean A. Irvine
 */
public class A084173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084173() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 3, 5, 13});
  }
}
