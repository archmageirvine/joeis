package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195143 <code>a(n) = n-th</code> concentric 12-gonal number.
 * @author Sean A. Irvine
 */
public class A195143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195143() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 12, 25});
  }
}
