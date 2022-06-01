package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160457 a(n) = n^2 - 2*n + 2.
 * @author Sean A. Irvine
 */
public class A160457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160457() {
    super(new long[] {1, -3, 3}, new long[] {2, 1, 2});
  }
}
