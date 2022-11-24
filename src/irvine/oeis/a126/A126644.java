package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126644 a(n) = 3*3^n - 3*2^n + 1.
 * @author Sean A. Irvine
 */
public class A126644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126644() {
    super(new long[] {6, -11, 6}, new long[] {4, 16, 58});
  }
}
