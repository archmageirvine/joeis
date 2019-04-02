package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276819 a(n) = a(n-1) + 9*n - 5 with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A276819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276819() {
    super(new long[] {1, -3, 3}, new long[] {1, 5, 18});
  }
}
