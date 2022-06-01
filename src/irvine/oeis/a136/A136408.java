package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136408 a(n) = 3*a(n-1) - 4*a(n-2) + 6*a(n-3) - 4*a(n-4).
 * @author Sean A. Irvine
 */
public class A136408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136408() {
    super(new long[] {-4, 6, -4, 3}, new long[] {1, 2, 4, 7});
  }
}
