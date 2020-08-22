package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022320 a(n) = a(n-1) + a(n-2) + 1, with a(0) = 1 and a(1) = 6.
 * @author Sean A. Irvine
 */
public class A022320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022320() {
    super(new long[] {-1, 0, 2}, new long[] {1, 6, 8});
  }
}
