package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056220 a(n) = 2*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A056220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056220() {
    super(new long[] {1, -3, 3}, new long[] {-1, 1, 7});
  }
}
