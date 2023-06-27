package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095264 a(n) = 2^(n+2) - 3*n - 4.
 * @author Sean A. Irvine
 */
public class A095264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095264() {
    super(1, new long[] {2, -5, 4}, new long[] {1, 6, 19});
  }
}
