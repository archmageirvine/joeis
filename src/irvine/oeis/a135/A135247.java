package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135247 a(n) = 3*a(n-1) + 2*a(n-2) - 6*a(n-3).
 * @author Sean A. Irvine
 */
public class A135247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135247() {
    super(new long[] {-6, 2, 3}, new long[] {0, 0, 1});
  }
}
