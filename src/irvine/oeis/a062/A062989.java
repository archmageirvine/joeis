package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062989 <code>a(n) = C(n+6, 6) - n - 1</code>.
 * @author Sean A. Irvine
 */
public class A062989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062989() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 5, 25, 80, 205, 456, 917});
  }
}
