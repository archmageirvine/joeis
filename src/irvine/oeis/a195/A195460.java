package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195460 a(n) = 2^(2*n+1) - 3*2^n - 1.
 * @author Sean A. Irvine
 */
public class A195460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195460() {
    super(new long[] {8, -14, 7}, new long[] {1, 19, 103});
  }
}
