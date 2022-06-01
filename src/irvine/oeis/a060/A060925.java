package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060925 a(n) = 2*a(n-1) + 3*a(n-2), a(0) = 1, a(1) = 4.
 * @author Sean A. Irvine
 */
public class A060925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060925() {
    super(new long[] {3, 2}, new long[] {1, 4});
  }
}
