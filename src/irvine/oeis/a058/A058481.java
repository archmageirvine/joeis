package irvine.oeis.a058;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A058481 a(n) = 3^n - 2.
 * @author Sean A. Irvine
 */
public class A058481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058481() {
    super(1, new long[] {-3, 4}, new long[] {1, 7});
  }
}
