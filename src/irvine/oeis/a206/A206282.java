package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206282 a(n) = ( a(n-1) * a(n-3) + a(n-2) ) / a(n-4), a(1) = a(2) = 1, a(3) = -1, a(4) = -4.
 * @author Sean A. Irvine
 */
public class A206282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206282() {
    super(new long[] {1, 0, 0, 2, 0, 0, -2, 0, 0}, new long[] {1, 1, -1, -4, -5, 1, 9, 11, -4});
  }
}
