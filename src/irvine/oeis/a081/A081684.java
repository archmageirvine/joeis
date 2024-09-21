package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081684 a(n) = 5^n - 4^n - 3^n - 2^n + 3.
 * @author Sean A. Irvine
 */
public class A081684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081684() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {1, -1, -1, 29, 275});
  }
}
