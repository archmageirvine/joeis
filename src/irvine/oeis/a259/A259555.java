package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259555 a(n) = 2*n^2 - 2*n + 17.
 * @author Sean A. Irvine
 */
public class A259555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259555() {
    super(1, new long[] {1, -3, 3}, new long[] {17, 21, 29});
  }
}
