package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135019 a(n) = -a(n-1) + 2a(n-2) - a(n-3), with a(0) = 0, a(1) = 1, a(2) = -3.
 * @author Sean A. Irvine
 */
public class A135019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135019() {
    super(new long[] {-1, 2, -1}, new long[] {0, 1, -3});
  }
}
