package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214831 a(n) = a(n-1) + a(n-2) + a(n-3), with a(0) = 1, a(1) = a(2) = 9.
 * @author Sean A. Irvine
 */
public class A214831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214831() {
    super(new long[] {1, 1, 1}, new long[] {1, 9, 9});
  }
}
