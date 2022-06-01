package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135344 a(n) = 3*a(n-1) - a(n-3) + 3*a(n-4).
 * @author Sean A. Irvine
 */
public class A135344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135344() {
    super(new long[] {3, -1, 0, 3}, new long[] {1, 1, 1, 1});
  }
}
