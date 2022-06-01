package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216450 a(n) = -10*a(n-1) - 3*a(n-2) + a(n-3) with a(0) = 3, a(1) = -10, and a(2) = 94.
 * @author Sean A. Irvine
 */
public class A216450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216450() {
    super(new long[] {1, -3, -10}, new long[] {3, -10, 94});
  }
}
