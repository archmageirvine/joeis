package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163476 a(n) = 20*a(n-1) - 97*a(n-2) for n &gt; 1; a(0) = 3, a(1) = 33.
 * @author Sean A. Irvine
 */
public class A163476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163476() {
    super(new long[] {-97, 20}, new long[] {3, 33});
  }
}
