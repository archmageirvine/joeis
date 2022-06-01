package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163348 a(n) = 6*a(n-1) - 7*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 7.
 * @author Sean A. Irvine
 */
public class A163348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163348() {
    super(new long[] {-7, 6}, new long[] {1, 7});
  }
}
