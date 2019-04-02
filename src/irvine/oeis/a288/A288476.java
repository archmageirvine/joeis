package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288476 a(n) = a(n-1) + 4*a(n-2) - 2*a(n-3), where a(0) = 2, a(1) = 4, a(2) = 8.
 * @author Sean A. Irvine
 */
public class A288476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288476() {
    super(new long[] {-2, 4, 1}, new long[] {2, 4, 8});
  }
}
