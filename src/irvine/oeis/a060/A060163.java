package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060163 a(n) = (n^3 + 5*n + 18)/6.
 * @author Sean A. Irvine
 */
public class A060163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060163() {
    super(-2, new long[] {-1, 4, -6, 4}, new long[] {0, 2, 3, 4});
  }
}
