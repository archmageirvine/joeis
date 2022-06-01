package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135345 a(n) = 3*a(n-1) + 4*a(n-2) - a(n-3) + 3*a(n-4) + 4*a(n-5).
 * @author Sean A. Irvine
 */
public class A135345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135345() {
    super(new long[] {4, 3, -1, 4, 3}, new long[] {1, 4, 13, 51, 204});
  }
}
