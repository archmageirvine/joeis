package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163459 a(n) = 14*a(n-1) - 47*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 8.
 * @author Sean A. Irvine
 */
public class A163459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163459() {
    super(new long[] {-47, 14}, new long[] {1, 8});
  }
}
