package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072863 a(n) = 2^(n-3)*(n^2+3*n+8).
 * @author Sean A. Irvine
 */
public class A072863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072863() {
    super(new long[] {8, -12, 6}, new long[] {1, 3, 9});
  }
}
