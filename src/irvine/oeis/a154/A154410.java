package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154410 a(n) = 5*(3*6^n + 2^n)/2.
 * @author Sean A. Irvine
 */
public class A154410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154410() {
    super(new long[] {-12, 8}, new long[] {10, 50});
  }
}
