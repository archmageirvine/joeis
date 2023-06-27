package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126284 a(n) = 5*2^n - 4*n - 5.
 * @author Sean A. Irvine
 */
public class A126284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126284() {
    super(1, new long[] {2, -5, 4}, new long[] {1, 7, 23});
  }
}
