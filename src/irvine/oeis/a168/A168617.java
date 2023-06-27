package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168617 a(n) = 7*2^(n-1) - 2*n - 5.
 * @author Sean A. Irvine
 */
public class A168617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168617() {
    super(1, new long[] {2, -5, 4}, new long[] {0, 5, 17});
  }
}
