package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154519 a(n) = 216*n + 12.
 * @author Sean A. Irvine
 */
public class A154519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154519() {
    super(new long[] {-1, 2}, new long[] {228, 444});
  }
}
