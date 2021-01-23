package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176449 a(n) = 9*2^n - 2.
 * @author Sean A. Irvine
 */
public class A176449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176449() {
    super(new long[] {-2, 3}, new long[] {7, 16});
  }
}
