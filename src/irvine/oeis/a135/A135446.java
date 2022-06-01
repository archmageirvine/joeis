package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135446 a(n) = 3*a(n-1) - 3*a(n-2) + 2*a(n-3).
 * @author Sean A. Irvine
 */
public class A135446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135446() {
    super(new long[] {2, -3, 3}, new long[] {-1, -1, 3});
  }
}
