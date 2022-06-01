package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227712 a(n) = 9*2^n - 3*n - 5.
 * @author Sean A. Irvine
 */
public class A227712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227712() {
    super(new long[] {2, -5, 4}, new long[] {4, 10, 25});
  }
}
