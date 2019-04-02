package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030119 a(n) = a(n-1) + a(n-2) + n, a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A030119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030119() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 1, 4, 8});
  }
}
