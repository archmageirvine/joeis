package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274761 a(n) = a(n-1) + a(n-2) + a(n-3), with a(0) = 3, a(1) = 2, a(2) = 5.
 * @author Sean A. Irvine
 */
public class A274761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274761() {
    super(new long[] {1, 1, 1}, new long[] {3, 2, 5});
  }
}
