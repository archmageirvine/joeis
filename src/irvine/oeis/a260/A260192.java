package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260192 Kronecker symbol(-6 / 2*n + 7).
 * @author Sean A. Irvine
 */
public class A260192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260192() {
    super(new long[] {-1, 0, 1, 0}, new long[] {1, 0, 1, -1});
  }
}
