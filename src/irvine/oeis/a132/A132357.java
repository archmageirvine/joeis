package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132357 a(n) = 3*a(n-1) - a(n-3) + 3*a(n-4), with initial values 1,4,14,41.
 * @author Sean A. Irvine
 */
public class A132357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132357() {
    super(new long[] {3, -1, 0, 3}, new long[] {1, 4, 14, 41});
  }
}
