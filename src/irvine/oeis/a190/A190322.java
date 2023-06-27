package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190322 a(1) = 1, a(2) = 9, a(3) = 17; for n&gt;3, a(n) = a(n-3) + 2.
 * @author Sean A. Irvine
 */
public class A190322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190322() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 9, 17, 3});
  }
}
